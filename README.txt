Principios Don't Repeat Yourself, Keep It Super Simple y You  Aren't Gonna Need It:
Nos esforzamos en esta implementación de seguir siempre que se pueda estos principios,
para mantener nuestro codigo poco repetitivo, facil de leer y sin elementos innecesarios.

Patrón Dependency Injection
Las clases delegan la construcción de dependencias, estas se inyectan desde el exterior.
En nuestro caso lo aplicamos cuando en los objetos de pacientes, en el constructor, le pasamos por parámetro
los DTOs de su respectivo tipo de paciente encapsulando así los atributos y delegando su creación a la clase que lo implemente
permitiendo un diseño más limpio, flexible y desacoplado.

Relacion con SOLID:
1- Este patrón de diseño romueve el Principio de Responsabilidad Única al separar la responsabilidad de crear objetos
de la clase que los usa.
2- También facilita el cumplimiento del Principio de Abierto/Cerrado, ya que permite que las dependencias se sustituyan o se extiendan
sin modificar el código de las clases que las consumen.
3- Respalda el Principio de Sustitución de Liskov al permitir que las clases dependan de interfaces o tipos abstractos en lugar de
implementaciones concretas. Esto facilita la sustitución de una implementación concreta por otra compatible sin afectar el
funcionamiento del sistema.
4- Promueve el Principio de Segregación de Interfaces al permitir la inyección de interfaces específicas y
enfocadas en lugar de grandes interfaces con métodos innecesarios.
5- es una forma directa de aplicar el Principio de Inversión de Dependencias. Mediante la inyección de dependencias, las clases no
dependen de implementaciones concretas, sino de abstracciones (interfaces). Las dependencias se proporcionan desde el exterior, de
manera que las clases de alto nivel pueden depender de interfaces, no de clases de bajo nivel.