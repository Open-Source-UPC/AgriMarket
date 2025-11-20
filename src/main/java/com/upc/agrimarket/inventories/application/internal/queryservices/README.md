# queryservices (application/internal/queryservices)

Propósito técnico

Servicios especializados en lectura/consultas complejas que la capa de aplicación puede necesitar (optimización, combinaciones, proyecciones).

Qué parte del enunciado resuelve

- Consultas de apoyo, por ejemplo verificar existencia de `Category` o búsquedas avanzadas de `Equipment`.

Archivos que deberían ir aquí

- `CategoryQueryService.java`, `EquipmentQueryService.java`.

Significado en DDD (técnico)

Separa la lógica de lectura de la de escritura para mantener handlers de comando simples.

Explicación para no programadores

Aquí están las consultas que sirven para buscar información o comprobar que algo existe antes de hacer cambios.

