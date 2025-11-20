package com.upc.agrimarket.inventories.application.internal.eventhandlers;


import com.upc.agrimarket.inventories.domain.model.entities.Category;
import com.upc.agrimarket.inventories.infrastructure.persistence.jpa.repositories.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Manejador de eventos para poblar las categorías al iniciar la aplicación.
 * <p>
 * Escucha el evento ApplicationReadyEvent y verifica si es necesario
 * poblar la tabla de categorías con los valores predefinidos.
 * </p>
 *
 * @author Juan Carlos Angulo
 */
@Service
public class ApplicationReadyEventHandler {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationReadyEventHandler.class);

    private final CategoryRepository categoryRepository;

    public ApplicationReadyEventHandler(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    /**
     * Maneja el evento ApplicationReadyEvent para poblar las categorías.
     * <p>
     * Verifica si la tabla de categorías está vacía y, en caso afirmativo,
     * la puebla con las categorías predefinidas: Tractors, Harvesters e Irrigation Systems.
     * </p>
     *
     * @param event Evento de aplicación lista
     */
    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void on(ApplicationReadyEvent event) {
        logger.info("Checking if categories need to be populated...");

        long categoryCount = categoryRepository.count();

        if (categoryCount == 0) {
            logger.info("Categories table is empty. Populating with default categories...");

            List<Category> defaultCategories = Arrays.asList(
                    new Category(1L, "Tractors"),
                    new Category(2L, "Harvesters"),
                    new Category(3L, "Irrigation Systems")
            );

            categoryRepository.saveAll(defaultCategories);
            logger.info("Categories populated successfully");
        } else {
            logger.info("Categories table already populated with {} entries", categoryCount);
        }
    }
}