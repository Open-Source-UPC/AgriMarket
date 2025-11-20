# outboundservices (application/internal/outboundservices)

Propósito técnico

Adaptadores de salida que la capa de aplicación utiliza para interactuar con la infraestructura (p. ej. repositorios JPA). Implementan los puertos requeridos por la aplicación.

Qué parte del enunciado resuelve

- Implementan la persistencia de `Equipment` y la consulta de `Category` mediante los repositorios.

Archivos que deberían ir aquí

- `EquipmentPersistenceAdapter.java`, `CategoryPersistenceAdapter.java`.

Significado en DDD (técnico)

Conecta la capa de aplicación con las implementaciones de persistencia; es donde los puertos se concretan.

Explicación para no programadores

Son los módulos que hablan con la base de datos para guardar o leer información de las máquinas y categorías.

