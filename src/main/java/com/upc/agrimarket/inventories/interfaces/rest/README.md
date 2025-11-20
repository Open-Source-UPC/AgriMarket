# rest (interfaces.rest)

Propósito técnico

Contiene los controladores REST que exponen la API pública para el bounded context: rutas, manejo de errores HTTP y configuración CORS si aplica.

Qué parte del enunciado resuelve

- Implementa `EquipmentController` con `POST /api/v1/equipment` y el manejo de respuestas 201 en caso de éxito y códigos de error apropiados.

Archivos que deberían ir aquí

- `EquipmentController.java`, clases de manejo de excepciones específicas del BC.

Significado en DDD (técnico)

El controlador actúa como adaptador de entrada que convierte requests HTTP en comandos de la aplicación.

Explicación para no programadores

Es la interfaz de la aplicación: los puntos de contacto donde clientes o navegadores pueden pedir crear una máquina.

