# jpa (infrastructure.persistence.jpa)

Propósito técnico

Contiene las entidades JPA (`@Entity`) y los repositorios Spring Data JPA que mapean el modelo del dominio a tablas SQL.

Qué parte del enunciado resuelve

- Define `EquipmentEntity` y `CategoryEntity`, constraints (unique index en `name`), longitudes, `@ManyToOne` con `Category` y campos de auditoría.

Archivos que deberían ir aquí

- `EquipmentEntity.java`, `CategoryEntity.java`, `EquipmentJpaRepository.java`, `CategoryJpaRepository.java`.

Significado en DDD (técnico)

Implementación concreta de persistencia que refleja el modelo del dominio en la base de datos.

Explicación para no programadores

Son las clases que actúan como "plantillas" para las tablas en la base de datos y las reglas que deben cumplir los datos.

