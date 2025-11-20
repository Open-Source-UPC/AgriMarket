# exceptions (inventories.domain.exceptions)

Propósito técnico

Contiene las excepciones específicas del dominio usadas para comunicar errores de negocio (por ejemplo: nombre duplicado, categoría inválida).

Qué parte del enunciado resuelve

- Implementa excepciones como `EquipmentNameAlreadyExistsException`, `CategoryNotFoundException`, `InvalidEquipmentException`.

Archivos que deberían ir aquí

- `EquipmentNameAlreadyExistsException.java`, `CategoryNotFoundException.java`.

Significado en DDD (técnico)

Las excepciones del dominio ayudan a separar errores de negocio frente a errores técnicos y facilitan el mapeo a respuestas HTTP adecuadas.

Explicación para no programadores

Son mensajes claros que se lanzan cuando las reglas del negocio (por ejemplo, no permitir dos máquinas con el mismo nombre) se rompen.

