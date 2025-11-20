# persistence (infrastructure.persistence)

Propósito técnico

Contiene los repositorios, entidades JPA y mapeadores utilizados para persistir el modelo en MySQL.

Qué parte del enunciado resuelve

- Implementa la tabla `categories` (pre-poblada) y la tabla de `equipment` con constraints y auditoría.

Archivos que deberían ir aquí

- `EquipmentRepository.java`, `CategoryRepository.java`, entidades JPA y mappers.

Significado en DDD (técnico)

Esta capa es la concreción técnica de los puertos de persistencia; contiene el código que ejecuta las operaciones de almacenamiento.

Explicación para no programadores

Aquí está el código que conoce cómo guardar y recuperar información en la base de datos del proyecto.

