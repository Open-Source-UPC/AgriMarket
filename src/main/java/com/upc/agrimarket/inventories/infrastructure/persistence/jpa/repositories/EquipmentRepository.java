package com.upc.agrimarket.inventories.infrastructure.persistence.jpa.repositories;

import com.upc.agrimarket.inventories.domain.model.aggregates.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio JPA para la entidad Equipment.
 *
 * @author Juan Carlos Angulo
 */
@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    /**
     * Verifica si existe un equipamiento con el nombre dado.
     *
     * @param name Nombre a verificar
     * @return true si existe, false en caso contrario
     */
    boolean existsByName(String name);

    /**
     * Busca un equipamiento por su nombre.
     *
     * @param name Nombre del equipamiento
     * @return Optional conteniendo el equipamiento si existe
     */
    Optional<Equipment> findByName(String name);
}