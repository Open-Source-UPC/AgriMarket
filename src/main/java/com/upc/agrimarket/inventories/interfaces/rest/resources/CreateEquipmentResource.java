package com.upc.agrimarket.inventories.interfaces.rest.resources;


/**
 * Resource para la creación de un equipamiento.
 *
 * @param name              Nombre del equipamiento
 * @param categoryId        ID de la categoría
 * @param description       Descripción del equipamiento
 * @param referenceImageUrl URL de la imagen de referencia
 * @author Juan Carlos Angulo
 */
public record CreateEquipmentResource(
        String name,
        Long categoryId,
        String description,
        String referenceImageUrl
) {
}