# transform (interfaces.rest.transform)

Propósito técnico

Contiene mapeadores que transforman entre DTOs/JSON y objetos de comando/dominio (y viceversa).

Qué parte del enunciado resuelve

- Mapea `EquipmentCreateRequest` a `AddEquipmentCommand` y convierte el resultado del dominio a `EquipmentResponse`.

Archivos que deberían ir aquí

- `EquipmentResourceMapper.java`.

Significado en DDD (técnico)

Desacopla la representación externa de la estructura interna de la aplicación.

Explicación para no programadores

Estos componentes traducen la información que llega de la web a un formato que el sistema puede procesar internamente, y devuelven la información en el formato que el cliente espera.

