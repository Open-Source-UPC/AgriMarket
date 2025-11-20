package com.upc.agrimarket.inventories.domain.model.commands;


/**
 * Comando para crear un nuevo equipamiento.
 *
 * @param name              Nombre del equipamiento
 * @param categoryId        ID de la categoría
 * @param description       Descripción del equipamiento
 * @param referenceImageUrl URL de la imagen de referencia
 * @author Juan Carlos Angulo
 */
public record CreateEquipmentCommand(
        String name,
        Long categoryId,
        String description,
        String referenceImageUrl
) {
}