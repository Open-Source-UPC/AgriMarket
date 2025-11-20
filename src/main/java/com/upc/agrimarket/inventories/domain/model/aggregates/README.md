# aggregates (domain.model.aggregates)

Propósito técnico

Contiene los aggregate roots del contexto; en nuestro caso `Equipment` es el aggregate root que garantiza sus invariantes y mantiene consistencia transaccional.

Qué parte del enunciado resuelve

- Implementa `Equipment` con sus campos obligatorios, validaciones y auditoría (createdAt, updatedAt).

Archivos que deberían ir aquí

- `Equipment.java` (aggregate root).

Significado en DDD (técnico)

Los aggregates definen límites de consistencia y son los únicos objetos que se pueden referenciar desde fuera por su identidad.

Explicación para no programadores

Un aggregate es como la ficha principal de una máquina, que contiene sus datos y asegura que siempre estén correctos.

