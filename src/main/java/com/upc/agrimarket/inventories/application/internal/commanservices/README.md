# commanservices (application/internal/commanservices)

Propósito técnico

Servicios auxiliares de la capa de aplicación: validaciones combinadas, transformaciones y helpers usados por handlers de comandos.

Qué parte del enunciado resuelve

- Implementa utilidades de validación (por ejemplo: comprobación compuesta de campos) y mapeos entre DTOs y comandos.

Archivos que deberían ir aquí

- `EquipmentValidationService.java`, `EquipmentMapper.java`.

Significado en DDD (técnico)

Código de soporte en la capa de aplicación que facilita la ejecución de casos de uso, sin contener lógica del dominio.

Explicación para no programadores

Son herramientas internas que ayudan a verificar que los datos estén bien antes de guardar una máquina.

