# Capa Infrastructure (inventories.infrastructure)

Propósito técnico

Contiene adaptadores técnicos y concretos: persistencia (JPA), documentación, y otras integraciones tecnológicas.

Qué parte del enunciado resuelve

- Implementaciones JPA para persistir `Equipment` y `Category`, creación de tablas y constraints (unicidad, longitudes, not null), y la inicialización de `categories`.

Archivos que deberían ir aquí

- Repositorios y entidades de persistencia, mapeadores y configuraiones específicas.

Significado en DDD (técnico)

Adapters que conectan el dominio y la aplicación con la tecnología (DB, mensajería, etc.).

Explicación para no programadores

Es el conjunto de componentes que hacen que los datos realmente se guarden en la base de datos y se lean desde ella.

