# Capa Application (inventories.application)

Propósito técnico

Contiene los casos de uso y la orquestación para operar sobre el dominio: commands, handlers y servicios de aplicación que coordinan validaciones y repositorios. No contiene lógica de negocio intrínseca al dominio (esa reside en `domain`).

Qué parte del enunciado resuelve

- Implementa el caso de uso "Agregar Equipment" (POST /api/v1/equipment).
- Orquesta la verificación de existencia de `Category` y la comprobación de unicidad de `name` antes de persistir.
- Contiene el command para poblar `categories` en Application Ready.

Archivos que deberían ir aquí

- `AddEquipmentCommand.java`, `AddEquipmentHandler.java`, `ApplicationCategoryInitializerCommand.java`.

Significado en DDD (técnico)

La capa de Application define los casos de uso y coordina la ejecución de operaciones del dominio, actuando como puente entre la interfaz y el domain.

Explicación para no programadores

Aquí está la lógica que decide paso a paso cómo crear una máquina nueva: qué comprobaciones hacer y en qué orden llamar a la base de datos.

