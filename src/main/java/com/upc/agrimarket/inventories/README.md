# Bounded Context: inventories
Esta carpeta agrupa todo lo necesario para manejar la información de las máquinas que se alquilan: reglas, almacenamiento y la forma en que otros programas pueden pedir crear una máquina nueva.

Explicación para no programadores

Un bounded context delimita el modelo y el vocabulario para la funcionalidad de inventarios. Aquí vive el lenguaje ubicuo relacionado con Equipment y Category.

Significado en DDD (técnico)

- `README.md` por subcarpeta explicativa (esta es la raíz del BC).
- Estructura de paquetes: `application/`, `domain/`, `infrastructure/`, `interfaces/`.

Archivos que deberían ir aquí (ejemplos)

- Gestiona la población inicial de la tabla `categories` al inicio de la aplicación.
- Soporta la operación de creación (POST) y las reglas asociadas (validaciones y respuestas HTTP apropiadas).
- Modela y persiste `Equipment` y su relación con `Category`.

Qué parte del enunciado resuelve

Este bounded context contiene todo lo relacionado con la gestión de equipments (maquinaria) dentro del dominio de AgriMarket. Implementa el agregado raíz `Equipment`, las reglas de negocio asociadas (unicidad de `name`, validaciones de campos, relación many-to-one con `Category`) y la exposición del endpoint REST `POST /api/v1/equipment`.

Propósito técnico


