# Capa Interfaces (inventories.interfaces)

Propósito técnico

Contiene adaptadores de entrada: controladores REST, DTOs y mappers que traducen solicitudes externas a comandos de aplicación.

Qué parte del enunciado resuelve

- Expone `POST /api/v1/equipment` a través de `EquipmentController` y mapea requests/response entre JSON y objetos de aplicación.

Archivos que deberían ir aquí

- `EquipmentController.java`, recursos/DTOs y transformadores.

Significado en DDD (técnico)

Los adaptadores de entrada traducen el universo externo (HTTP/JSON) a comandos y queries que la aplicación entiende.

Explicación para no programadores

Es la parte que recibe las peticiones desde la web (o clientes) y las convierte en acciones que el sistema entiende.

