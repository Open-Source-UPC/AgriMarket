package com.upc.agrimarket.inventories.interfaces.rest.resources;


/**
 * Resource que representa un equipamiento en las respuestas del API.
 *
 * @param id                ID del equipamiento
 * @param name              Nombre del equipamiento
 * @param categoryId        ID de la categoría
 * @param categoryName      Nombre de la categoría
 * @param description       Descripción del equipamiento
 * @param referenceImageUrl URL de la imagen de referencia
 * @author Juan Carlos Angulo
 */
public record EquipmentResource(
        Long id,
        String name,
        Long categoryId,
        String categoryName,
        String description,
        String referenceImageUrl
) {
}