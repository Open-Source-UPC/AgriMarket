package com.upc.agrimarket.inventories.interfaces.rest;


import com.upc.agrimarket.inventories.domain.services.EquipmentCommandService;
import com.upc.agrimarket.inventories.interfaces.rest.resources.CreateEquipmentResource;
import com.upc.agrimarket.inventories.interfaces.rest.resources.EquipmentResource;
import com.upc.agrimarket.inventories.interfaces.rest.transform.CreateEquipmentCommandFromResourceAssembler;
import com.upc.agrimarket.inventories.interfaces.rest.transform.EquipmentResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Controlador REST para gestionar equipamientos agrícolas.
 * <p>
 * Expone endpoints para las operaciones CRUD relacionadas con equipamientos
 * en la plataforma AgriMarket.
 * </p>
 *
 * @author Juan Carlos Angulo
 */
@RestController
@RequestMapping(value = "/api/v1/equipment", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Equipment", description = "Equipment Management Endpoints")
public class EquipmentController {

    private final EquipmentCommandService equipmentCommandService;
    private final MessageSource messageSource;

    public EquipmentController(EquipmentCommandService equipmentCommandService, MessageSource messageSource) {
        this.equipmentCommandService = equipmentCommandService;
        this.messageSource = messageSource;
    }

    /**
     * Crea un nuevo equipamiento.
     *
     * @param resource Datos del equipamiento a crear
     * @return ResponseEntity con el equipamiento creado y status 201, o error con status apropiado
     */
    @Operation(summary = "Create a new equipment", description = "Creates a new agricultural equipment")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Equipment created successfully",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = EquipmentResource.class))),
            @ApiResponse(responseCode = "400", description = "Bad request - Invalid input data",
                    content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "409", description = "Conflict - Equipment with same name already exists",
                    content = @Content(mediaType = "application/json"))
    })
    @PostMapping
    public ResponseEntity<?> createEquipment(@RequestBody CreateEquipmentResource resource,
                                             @RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        Locale effectiveLocale = locale != null ? locale : Locale.getDefault();
        try {
            var command = CreateEquipmentCommandFromResourceAssembler.toCommandFromResource(resource);
            var equipment = equipmentCommandService.handle(command);

            if (equipment.isEmpty()) {
                String msg = messageSource.getMessage("equipment.error.creation", null, effectiveLocale);
                return ResponseEntity.badRequest().body(msg);
            }

            var equipmentResource = EquipmentResourceFromEntityAssembler.toResourceFromEntity(equipment.get());
            return new ResponseEntity<>(equipmentResource, HttpStatus.CREATED);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            String msg = messageSource.getMessage("error.internal", null, effectiveLocale);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(msg);
        }
    }
}