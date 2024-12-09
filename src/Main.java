import Controller.PatientController;
import Model.AdultPatient;
import Model.PediatricPatient;
import Model.Patient;
import View.PatientView;

import java.util.Scanner;


/* Pilares implementados:
    - Polimorfismo: Se implementa al usar una referencia de la clase abstracta `Paciente`,
    pero instanciando objetos de sus clases concretas (por ejemplo, `PacienteAdulto` o `PacientePediatrico`).
    Esto permite que el comportamiento de los métodos varíe según el tipo específico de objeto.
    - Herencia: Los métodos y atributos de la clase abstracta `Paciente` son heredados por sus clases hijas,
     como `PacienteAdulto` y `PacientePediatrico`. Esto permite la reutilización de código
      y facilita la extensión de la funcionalidad.
    - Encapsulamiento: Se asegura la protección de los atributos de los objetos mediante el
    uso de getters y setters. Los datos de los pacientes no son accesibles directamente desde
    fuera de la clase, sino a través de métodos que permiten controlarlos y validarlos antes de modificarlos.
    - Abstracción: El método `toString()` es un ejemplo de abstracción. La clase `Main` puede llamar
                         a este método para obtener una representación del objeto sin conocer cómo
                                   se genera internamente, solo viendo el resultado final.
 */

public class Main {
    public static void main(String[] args) {

        PatientView patientView = new PatientView();

        PatientController patientController = new PatientController(patientView);

        patientController.run();
    }
}