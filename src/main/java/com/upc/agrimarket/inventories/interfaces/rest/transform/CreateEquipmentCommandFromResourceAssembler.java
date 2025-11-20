package com.upc.agrimarket.inventories.interfaces.rest.transform;


import com.upc.agrimarket.inventories.domain.model.commands.CreateEquipmentCommand;
import com.upc.agrimarket.inventories.interfaces.rest.resources.CreateEquipmentResource;

/**
 * Assembler para transformar CreateEquipmentResource a CreateEquipmentCommand.
 *
 * @author Juan Carlos Angulo
 */
public class CreateEquipmentCommandFromResourceAssembler {

    /**
     * Transforma un resource de creación en un comando de creación.
     *
     * @param resource Resource con los datos del equipamiento
     * @return Comando para crear el equipamiento
     */
    public static CreateEquipmentCommand toCommandFromResource(CreateEquipmentResource resource) {
        return new CreateEquipmentCommand(
                resource.name(),
                resource.categoryId(),
                resource.description(),
                resource.referenceImageUrl()
        );
    }
}