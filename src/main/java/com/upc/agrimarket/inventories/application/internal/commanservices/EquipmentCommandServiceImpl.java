package com.upc.agrimarket.inventories.application.internal.commanservices;

import com.upc.agrimarket.inventories.domain.model.aggregates.Equipment;
import com.upc.agrimarket.inventories.domain.model.commands.CreateEquipmentCommand;
import com.upc.agrimarket.inventories.domain.model.entities.Category;
import com.upc.agrimarket.inventories.domain.services.EquipmentCommandService;
import com.upc.agrimarket.inventories.infrastructure.persistence.jpa.repositories.CategoryRepository;
import com.upc.agrimarket.inventories.infrastructure.persistence.jpa.repositories.EquipmentRepository;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;
import java.util.Optional;

/**
 * Implementación del servicio de comandos para Equipment.
 * <p>
 * Maneja la lógica de negocio relacionada con la creación de equipamientos,
 * incluyendo validaciones de reglas de negocio.
 * </p>
 *
 * @author Juan Carlos Angulo
 */

@Service
public class EquipmentCommandServiceImpl implements EquipmentCommandService {

    private final EquipmentRepository equipmentRepository;
    private final CategoryRepository categoryRepository;
    private final MessageSource messageSource;

    public EquipmentCommandServiceImpl(EquipmentRepository equipmentRepository,
                                       CategoryRepository categoryRepository,
                                       MessageSource messageSource) {
        this.equipmentRepository = equipmentRepository;
        this.categoryRepository = categoryRepository;
        this.messageSource = messageSource;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Optional<Equipment> handle(CreateEquipmentCommand command) {
        Locale locale = Locale.getDefault();
        // Validar que el nombre no esté vacío
        if (command.name() == null || command.name().isBlank()) {
            throw new IllegalArgumentException(messageSource.getMessage("equipment.name.notBlank", null, locale));
        }

        // Validar longitud del nombre
        if (command.name().length() > 80) {
            throw new IllegalArgumentException(messageSource.getMessage("equipment.name.length", null, locale));
        }

        // Validar que no exista un equipment con el mismo nombre
        if (equipmentRepository.existsByName(command.name())) {
            throw new IllegalArgumentException(messageSource.getMessage("equipment.name.duplicate", null, locale));
        }

        // Validar que la descripción no esté vacía
        if (command.description() == null || command.description().isBlank()) {
            throw new IllegalArgumentException(messageSource.getMessage("equipment.description.notBlank", null, locale));
        }

        // Validar longitud de la descripción
        if (command.description().length() > 350) {
            throw new IllegalArgumentException(messageSource.getMessage("equipment.description.length", null, locale));
        }

        // Validar que la URL de imagen no esté vacía
        if (command.referenceImageUrl() == null || command.referenceImageUrl().isBlank()) {
            throw new IllegalArgumentException(messageSource.getMessage("equipment.image.notBlank", null, locale));
        }

        // Validar que la categoría exista
        Category category = categoryRepository.findById(command.categoryId())
                .orElseThrow(() -> new IllegalArgumentException(
                        messageSource.getMessage("category.notFound", new Object[]{command.categoryId()}, locale)));

        // Crear el equipment
        Equipment equipment = new Equipment(
                command.name(),
                category,
                command.description(),
                command.referenceImageUrl()
        );

        // Guardar y retornar
        Equipment savedEquipment = equipmentRepository.save(equipment);
        return Optional.of(savedEquipment);
    }
}