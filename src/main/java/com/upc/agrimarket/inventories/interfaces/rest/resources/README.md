# resources (interfaces.rest.resources)

Propósito técnico

Contiene los DTOs (request/response) usados por los controladores REST para validar y transportar datos.

Qué parte del enunciado resuelve

- Define el payload para crear un `Equipment` (sin `id`) y la representación de respuesta (con `id` generado y campos auditables si aplica).

Archivos que deberían ir aquí

- `EquipmentCreateRequest.java`, `EquipmentResponse.java`.

Significado en DDD (técnico)

Los resources son contratos de API que definen la forma de los mensajes que entran y salen.

Explicación para no programadores

Son plantillas que definen cómo debe enviarse la información para crear una máquina y cómo se verá la respuesta.

