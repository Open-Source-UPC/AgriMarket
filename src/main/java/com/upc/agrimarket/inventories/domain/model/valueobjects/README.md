# valueobjects (domain.model.valueobjects)

Propósito técnico

Contiene objetos de valor inmutables que encapsulan reglas sobre un dato (por ejemplo `Name`, `Description`) para validar longitudes y formatos.

Qué parte del enunciado resuelve

- Encapsula validaciones como máximo de 80 caracteres para `name` o máximo 350 para `description`.

Archivos que deberían ir aquí

- `EquipmentName.java`, `EquipmentDescription.java`.

Significado en DDD (técnico)

Los Value Objects contienen reglas de validación y son comparados por su contenido, no por identidad.

Explicación para no programadores

Son objetos que representan un dato concreto (como el nombre) y garantizan que siempre tenga un formato válido.

