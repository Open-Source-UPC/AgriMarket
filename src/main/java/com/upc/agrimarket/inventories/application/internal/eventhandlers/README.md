# eventhandlers (application/internal/eventhandlers)

Propósito técnico

Manejadores de eventos de la aplicación (por ejemplo, `ApplicationReadyEvent`). Aquí se colocan listeners que reaccionan a eventos del ciclo de vida de la app.

Qué parte del enunciado resuelve

- Implementa el handler que, al evento de aplicación lista, ejecuta el comando para poblar la tabla `categories` si está vacía.

Archivos que deberían ir aquí

- `PopulateCategoriesOnStartupHandler.java`.

Significado en DDD (técnico)

Los event handlers permiten ejecutar acciones en respuesta a eventos aplicacionales; forman parte de la orquestación.

Explicación para no programadores

Cuando la aplicación arranca, estos componentes revisan que las categorías estén presentes y las crean si hacen falta.

