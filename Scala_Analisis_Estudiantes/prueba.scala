@main
def main(): Unit = {

    case class Estudiante(numeroCuenta: String, carrera: String, clasesAprobadas: List[String])


    println("Conteo de Estudiantes")

    // Usando la sintaxis del segundo código
    var ListEstudiantes: List[Estudiante] = List(
        Estudiante("2020", "Ingenieria Agroindustrial", List("Introducion_Agro", "maquinas", "MM-110", "español")),
        Estudiante("2021", "Admin_Empresas", List("metodos_1", "metodos_2", "metodos_3", "español")),
        Estudiante("2022", "Admin_Empresas", List("metodos_1", "Gerencia", "español")),
        Estudiante("2026", "Ingeniería_Sistemas", List("programacion_1", "algoritmos", "bases_de_datos", "español")),
        Estudiante("2025", "Ingeniería_Mecánica", List("termodinamica", "materiales", "español")),
        Estudiante("2023", "Economía", List("microeconomia", "macroeconomia", "español")),
        Estudiante("2019", "Admin_Empresas", List("finanzas", "contabilidad", "marketing", "español")),
        Estudiante("2023", "Ingeniería_Sistemas", List("desarrollo_web", "tecnologias", "programacion_1")),
        Estudiante("2025", "Ingeniería_Mecánica", List("MM-110", "maquinas", "español")),
        Estudiante("2020", "Economía", List("español"))
    )

    // Promedio de clases aprobadas
    val Promedio: Double = ListEstudiantes.map(_.clasesAprobadas.size).sum.toDouble / ListEstudiantes.size
    println(f"El promedio de las clases aprobadas por los estudiantes es: $Promedio%.2f")

    // Conteo de clases aprobadas
    var conteoClases: Map[String, Int] = ListEstudiantes.flatMap(_.clasesAprobadas).groupBy(identity).map {
        case (clase, lista) => (clase, lista.size)
    }

    // Clase menos y más aprobada
    var claseMenosAprobada = conteoClases.minBy(_._2)
    var claseMasAprobada = conteoClases.maxBy(_._2)
    

    println(s"La clase menos aprobada es: ${claseMenosAprobada._1} con ${claseMenosAprobada._2} aprobación(es)")
    println(s"La clase más aprobada es: ${claseMasAprobada._1} con ${claseMasAprobada._2} aprobación(es)")
  

    // Promedio por carrera
    var promedioPorCarrera: Map[String, Double] = ListEstudiantes.groupBy(_.carrera).map {
        case (carrera, ests) => (carrera, ests.map(_.clasesAprobadas.size).sum.toDouble / ests.size)
    }

    println("")
    var carreraMayorPromedio = promedioPorCarrera.maxBy(_._2)
    println(s"La carrera con mayor promedio de clases aprobadas es: ${carreraMayorPromedio._1} con un promedio de ${carreraMayorPromedio._2} clases aprobadas")
    println("")
    

    println("Estudiantes con Clases aprobadas")

    
    // Imprimir estudiantes
    ListEstudiantes.foreach { estudiante =>
        println(s"Estudiante: ${estudiante.numeroCuenta}, Carrera: ${estudiante.carrera}, Clases Aprobadas: ${estudiante.clasesAprobadas.mkString(", ")}")
    }
    
}
