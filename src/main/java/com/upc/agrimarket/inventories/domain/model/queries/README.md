# queries (domain.model.queries)

Propósito técnico

Contiene objetos o servicios para consultas específicas del dominio (si se aplica un enfoque CQRS o se necesita lógica de lectura especializada).

Qué parte del enunciado resuelve

- Consultas para obtener categorías o validar existencia necesaria antes de crear un Equipment.

Archivos que deberían ir aquí

- `FindCategoryByIdQuery.java`, `CategoryProjection.java` (si aplica).

Significado en DDD (técnico)

Separar la lectura de la escritura cuando conviene para optimizar rendimiento o claridad.

Explicación para no programadores

Aquí están las piezas usadas para buscar datos cuando el sistema necesita consultarlos en lugar de modificarlos.

