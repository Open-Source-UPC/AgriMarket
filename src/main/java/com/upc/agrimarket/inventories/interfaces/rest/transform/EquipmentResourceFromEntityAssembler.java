package com.upc.agrimarket.inventories.interfaces.rest.transform;


import com.upc.agrimarket.inventories.domain.model.aggregates.Equipment;
import com.upc.agrimarket.inventories.interfaces.rest.resources.EquipmentResource;

/**
 * Assembler para transformar Equipment a EquipmentResource.
 *
 * @author Juan Carlos Angulo
 */
public class EquipmentResourceFromEntityAssembler {

    /**
     * Transforma una entidad Equipment en un resource para la respuesta del API.
     *
     * @param entity Entidad Equipment
     * @return Resource con los datos del equipamiento
     */
    public static EquipmentResource toResourceFromEntity(Equipment entity) {
        return new EquipmentResource(
                entity.getId(),
                entity.getName(),
                entity.getCategory().getId(),
                entity.getCategory().getName(),
                entity.getDescription(),
                entity.getReferenceImageUrl()
        );
    }
}