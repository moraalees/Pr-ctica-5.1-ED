# Pr-ctica-5.1-ED

1.Interpreta el significado del diagrama de clases.
a) Relación entre las clases. Significado, tipo, multiplicidad.

Significado: La relación señala que un curso contiene múltiples estudiantes. Es una relación de composición, es decir, un curso no puede existir sin estudiantes asociados.

Tipo: Composición, por el rombo.

Multiplicidad: Un curso puede contener múltiples estudiantes, es decir, un curso puede tener varios estudiantes, pero un estudiante pertenece a solo un curso.


b) Elementos de las clases. Tipos y propósitos. 

Clase Curso:
Atributos:
String nombre: Guarda el nombre del curso.
String código: Identificador único del curso.
MutableList estudiantes: Lista mutable que almacena objetos de tipo Estudiante.

Clase Estudiante:
Atributos:
String nombre: Nombre del estudiante.
String DNI: Documento de identidad del estudiante.

Los métodos los explico en los siguientes apartados.


c) Significado del método agregarAlumno(). Funcionamiento. 

El método agregarAlumno() sirve para añadir un objeto de tipo Estudiante a la lista estudiantes que está dentro del curso. Funciona así:

Recibe un objeto de tipo Estudiante.
Agrega dicho objeto a la lista mutable de estudiantes del curso.
Verifica condiciones, como si el estudiante ya está inscrito antes de agregarlo o si el nombre del alumno está vacío.


d) Significado del método inscribirse()

El método inscribirse() sirve para que un estudiante se registre en un curso específico. Funciona de la siguiente manera:

Llama al método agregarAlumno() para añadir el estudiante.
Actualiza cualquier dato dentro del estudiante (por ejemplo asociarse con el curso).
Verifica condiciones, como si hay cupos disponibles o evita inscripciones duplicadas.
