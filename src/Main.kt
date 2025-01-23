fun main(){
    val estudiante1 = Estudiante("Gerardo", "55921558U")
    val estudiante2 = Estudiante("Rosa Belén", "77433963H")
    val estudiante3 = Estudiante("Higuaín", "92569230E")
    val estudiante4 = Estudiante("Jimena", "22056192R")
    val estudiante5 = Estudiante("Wally", "69569201L")
    val estudiante6 = Estudiante("Ana Lisa", "77497602O")
    val estudiante7 = Estudiante("Luis", "84392482R")

    val curso1 = Curso("1º A", "U33")
    val curso2 = Curso("1º B", "U37")

    curso1.mostrarEstudiantes()
    curso1.agregarAlumno(estudiante1)
    curso1.agregarAlumno(estudiante3)
    curso1.mostrarEstudiantes()

    curso2.agregarAlumno(estudiante2)
    curso2.agregarAlumno(estudiante2)
    curso2.agregarAlumno(estudiante5)
    curso2.agregarAlumno(estudiante7)
    curso2.mostrarEstudiantes()
    estudiante4.inscribirse(curso2)
    curso2.mostrarEstudiantes()
}