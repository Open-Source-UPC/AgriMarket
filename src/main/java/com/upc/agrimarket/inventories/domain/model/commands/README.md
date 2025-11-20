# commands (domain.model.commands)

Propósito técnico

Contiene objetos que representan intenciones de cambio (comandos) que la capa de aplicación ejecuta contra el dominio.

Qué parte del enunciado resuelve

- `AddEquipmentCommand` que transporta la información necesaria para crear un `Equipment`.

Archivos que deberían ir aquí

- `AddEquipmentCommand.java`.

Significado en DDD (técnico)

Los comandos son DTOs que expresan una acción del sistema (por ejemplo: "crear un equipo").

Explicación para no programadores

Un comando es la instrucción formal que el sistema recibe para realizar una acción (como un formulario enviado para crear una máquina).

