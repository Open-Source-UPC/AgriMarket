package com.upc.agrimarket.inventories.domain.model.aggregates;

import com.upc.agrimarket.inventories.domain.model.entities.Category;
import com.upc.agrimarket.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

/**
 * Aggregate Root que representa un equipamiento agrícola.
 * <p>
 * Contiene toda la información relacionada con un equipo disponible
 * para alquiler en la plataforma AgriMarket.
 * </p>
 *
 * @author Juan Carlos Angulo
 */

@Entity
@Table(name = "equipments")
@Getter
public class Equipment extends AuditableAbstractAggregateRoot<Equipment> {
    @NotBlank(message = "{equipment.name.notBlank}")
    @NotNull(message = "{equipment.name.notBlank}")
    @Size(max = 80, message = "{equipment.name.length}")
    @Column(nullable = false, length = 80, unique = true)
    private String name;

    @NotBlank(message = "{equipment.description.notBlank}")
    @NotNull(message = "{equipment.description.notBlank}")
    @Size(max = 350, message = "{equipment.description.length}")
    @Column(nullable = false, length = 350)
    private String description;

    @NotNull(message = "{equipment.category.notNull}")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @NotBlank(message = "{equipment.image.notBlank}")
    @NotNull(message = "{equipment.image.notBlank}")
    @Column(name = "reference_image_url", nullable = false)
    private String referenceImageUrl;

    protected Equipment() {}

    /**
     * Constructor para crear un nuevo equipamiento.
     *
     * @param name              Nombre del equipamiento
     * @param category          Categoría del equipamiento
     * @param description       Descripción detallada del equipamiento
     * @param referenceImageUrl URL de la imagen de referencia
     */

    public Equipment (String name, Category category,String description, String referenceImageUrl) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.referenceImageUrl = referenceImageUrl;
    }
}
