class Curso(var nombre: String, val codigo: String) {

    var estudiantes: MutableList<Estudiante> = mutableListOf<Estudiante>()

    fun agregarAlumno(estudiante: Estudiante): Boolean {
        if (estudiante.nombre.isEmpty()){
            println("El nombre del estudiante es nulo, no podemos agregarlo...")
            return false
        } else if (estudiante in estudiantes){
            println("El estudiante ${estudiante.nombre} ya está añadido...")
            return false
        } else {
            estudiantes.add(estudiante)
            println("¡Estudiante ${estudiante.nombre} agregado/a con éxito!")
            return true
        }
    }

    fun mostrarEstudiantes(){
        if (estudiantes.size == 0){
            println("No hay estudiantes asignados al curso...")
        } else {
            var contador = 0
            for (estudiante in estudiantes){
                contador += 1
                println("Estudiante $contador: ${estudiante.nombre}")
            }
        }
    }
}


class Estudiante(var nombre: String, val dni: String) {

    init{
        require(dni.length == 9){ "El DNI es inválido..." }
    }

    fun inscribirse(curso: Curso): Boolean {
        if (this in curso.estudiantes) {
            println("Lo sentimos pero ya estás inscrito en el curso...")
            return false
        } else {
            curso.estudiantes.add(this)
            println("¡Estudiante ${this.nombre} añadido/a con éxito!")
            return true
        }
    }
}