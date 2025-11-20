package com.upc.agrimarket.inventories.infrastructure.persistence.jpa.repositories;

import com.upc.agrimarket.inventories.domain.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio JPA para la entidad Category.
 *
 * @author Juan Carlos Angulo
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}