# events (domain.model.events)

Propósito técnico

Lugar para eventos de dominio que expresan que algo importante ocurrió (por ejemplo `EquipmentCreatedEvent`).

Qué parte del enunciado resuelve

- Permite publicar eventos tras la creación de `Equipment` si se desea para auditoría o integración con otros BCs.

Archivos que deberían ir aquí

- `EquipmentCreatedEvent.java` (opcional según diseño).

Significado en DDD (técnico)

Los eventos de dominio comunican sucesos relevantes y son útiles para integraciones asíncronas.

Explicación para no programadores

Un evento es una notificación interna que dice "esto sucedió" y permite que otras partes del sistema reaccionen.

