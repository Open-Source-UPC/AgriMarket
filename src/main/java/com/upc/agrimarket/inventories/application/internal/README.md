# application.internal

Propósito técnico

Subpaquete para implementaciones internas de la capa de aplicación: handlers, services y adaptadores que no forman parte de la API pública, pero ejecutan la lógica de orquestación.

Qué parte del enunciado resuelve

- Implementa los handlers que realizan la creación de Equipment y la inicialización de `categories` al arrancar la app.

Archivos que deberían ir aquí

- `AddEquipmentHandler.java`, `PopulateCategoriesEventHandler.java`, adaptadores internos.

Significado en DDD (técnico)

Organiza la lógica de orquestación de la aplicación en submódulos internos, manteniendo la capa limpia.

Explicación para no programadores

Contiene las piezas que internamente realizan las acciones solicitadas por la aplicación (como un equipo que sigue instrucciones para completar una tarea).

