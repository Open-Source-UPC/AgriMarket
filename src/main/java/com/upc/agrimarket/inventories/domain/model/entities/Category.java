package com.upc.agrimarket.inventories.domain.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Representa una categoría de equipamiento agrícola.
 * <p>
 * Esta entidad define las categorías predefinidas para clasificar los equipos.
 * Las categorías son: Tractors, Harvesters e Irrigation Systems.
 * </p>
 *
 * @author Juan Carlos Angulo
 */


@Entity
@Table(name = "categories")
@Getter
public class Category {
    @Id
    private Long id;

    @Column(nullable = false, length = 80, unique = true)
    private String name;

    protected Category() {}

    /**
     * Constructor para crear una categoría.
     *
     * @param id   Identificador único de la categoría
     * @param name Nombre de la categoría
     */

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
