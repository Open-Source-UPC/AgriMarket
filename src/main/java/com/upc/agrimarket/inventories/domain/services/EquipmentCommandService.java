package com.upc.agrimarket.inventories.domain.services;

import com.upc.agrimarket.inventories.domain.model.aggregates.Equipment;
import com.upc.agrimarket.inventories.domain.model.commands.CreateEquipmentCommand;

import java.util.Optional;

/**
 * Servicio de dominio para comandos de Equipment.
 *
 * @author Juan Carlos Angulo
 */

public interface EquipmentCommandService {

    /**
     * Maneja el comando para crear un nuevo equipamiento.
     *
     * @param command Comando con los datos del equipamiento a crear
     * @return Optional conteniendo el equipamiento creado
     * @throws IllegalArgumentException si los datos no son válidos
     */
    Optional<Equipment> handle(CreateEquipmentCommand command);
}
