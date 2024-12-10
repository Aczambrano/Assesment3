# Principios

## Don't Repeat Yourself (DRY), Keep It Super Simple (KISS) y You Aren't Gonna Need It (YAGNI)

Nos esforzamos en esta implementación por seguir, siempre que sea posible, estos principios para:
- Mantener nuestro código poco repetitivo.
- Hacerlo fácil de leer y entender.
- Evitar la inclusión de elementos innecesarios.

## Patrón Dependency Injection

Este patrón establece que las clases delegan la construcción de sus dependencias, las cuales se inyectan desde el exterior. En nuestra implementación, esto se aplica al trabajar con objetos de pacientes:
- En el constructor de los pacientes, se pasa como parámetro el DTO correspondiente al tipo de paciente.
- Los atributos están encapsulados en estos DTOs, y su creación queda delegada a la clase que los implemente.

Esto permite un diseño más limpio, flexible y desacoplado, facilitando el mantenimiento y la extensibilidad del sistema.

## Relación con los principios SOLID

### 1. Principio de Responsabilidad Única (SRP)
El patrón Dependency Injection promueve este principio al separar la responsabilidad de crear objetos de la clase que los utiliza.

### 2. Principio de Abierto/Cerrado (OCP)
Facilita el cumplimiento de este principio, ya que permite sustituir o extender dependencias sin modificar el código de las clases consumidoras.

### 3. Principio de Sustitución de Liskov (LSP)
Al depender de interfaces o tipos abstractos, las clases pueden sustituir una implementación concreta por otra compatible sin afectar el funcionamiento del sistema.

### 4. Principio de Segregación de Interfaces (ISP)
Promueve la inyección de interfaces específicas y enfocadas en lugar de grandes interfaces con métodos innecesarios, mejorando la cohesión.

### 5. Principio de Inversión de Dependencias (DIP)
Aplica directamente este principio al lograr que las clases:
- Dependan de abstracciones (interfaces) en lugar de implementaciones concretas.
- Reciban sus dependencias desde el exterior, lo que desacopla las clases de alto nivel de las de bajo nivel.

Con estas prácticas, logramos un código más modular, mantenible y alineado con los principios de diseño de software.

