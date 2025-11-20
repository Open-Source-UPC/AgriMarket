# services (domain.services)

Propósito técnico

Servicios de dominio con lógica que no pertenece a un único aggregate (por ejemplo: verificación compuesta de unicidad ante concurrencia).

Qué parte del enunciado resuelve

- Servicio que verifica la unicidad de `name` y aplica reglas atómicas cuando se requiere.

Archivos que deberían ir aquí

- `EquipmentDomainService.java`.

Significado en DDD (técnico)

Domain Services encapsulan lógica que involucra varias entidades o que no encaja en un aggregate específico.

Explicación para no programadores

Son funciones que realizan operaciones del negocio que no pertenecen a una sola entidad, por ejemplo, comprobar que nadie más tiene el mismo nombre.

