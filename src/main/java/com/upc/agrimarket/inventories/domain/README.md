# Capa Domain (inventories.domain)

Propósito técnico

Contiene el modelo del dominio: aggregates, entidades, value objects, reglas de negocio, excepciones y servicios de dominio.

Qué parte del enunciado resuelve

- Implementa las invariantes del aggregate `Equipment`: unicidad de `name`, validaciones de campos (no vacío, longitudes máximas), relación many-to-one con `Category`, y auditoría (fechas de creación/actualización).

Archivos que deberían ir aquí

- `Equipment.java` (aggregate root), `Category.java` (entidad referenciada), excepciones de dominio y servicios.

Significado en DDD (técnico)

La capa de dominio concentra las reglas de negocio que deben permanecer independientes de la infraestructura.

Explicación para no programadores

Es la "regla de negocio" central: define qué es una máquina, qué datos debe tener, y qué condiciones debe cumplir para ser válida.

