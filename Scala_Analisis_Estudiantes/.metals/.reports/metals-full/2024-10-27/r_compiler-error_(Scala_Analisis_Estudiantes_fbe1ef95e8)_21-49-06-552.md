file:///C:/Users/Yeison/Documents/Lenguajes%20de%20programacion/Scala_Analisis_Estudiantes/main.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Yeison/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.14/scala-library-2.13.14-sources.jar!/scala/collection/immutable/List.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1175
uri: file:///C:/Users/Yeison/Documents/Lenguajes%20de%20programacion/Scala_Analisis_Estudiantes/main.scala
text:
```scala
import scala.compiletime.ops.double
@main
def main(): Unit ={ 
    case class Estudiante(Numero_Cuenta: String, Carrera: String, Clases_Aprobadas: List[String])

var ListEstudiantes: List[Estudiante] = List(
    Estudiante("2020","Ingenieria Agroindustrial",List("Introducion_Agro","maquina","MM-110","Español")),
    Estudiante("2021","Admin_Empresas",List("metodos_1","metodos_2","metodos_3","español")),
    Estudiante("2022", "Admin_Empresas", List("metodos_1","Gerencia", "español")),
    Estudiante("2026", "Ingeniería_Sistemas", List("programacion_1", "algoritmos", "bases_de_datos", "español")),
    Estudiante("2025", "Ingeniería_Mecánica", List("termodinamica","materiales", "español")),
    Estudiante("2023", "Economía", List("microeconomia", "macroeconomia", "español")),
    Estudiante("2019", "Admin_Empresas", List("finanzas", "contabilidad", "marketing", "español")),
    Estudiante("2023", "Ingeniería_Sistemas", List("desarrollo_web", "tecnologias", "programacion_1")),
    Estudiante("2025", "Ingeniería_Mecánica", List("MM-110", "maquinas", "español")),
    Estudiante("2020", "Economía", List("español"))    
)

val Promedio:  Double = ListEstudiantes.m@@
//var contarclases : Map[String, Int] = Estudiante.FlatMap(_.Clases_Aprobadas).groupBy(identity).Map
var conteoClases: Map[String, Int] = ListEstudiantes.flatMap(_.Clases_Aprobadas).groupBy(identity).map {
        case (clase, lista) => (clase, lista.size)
    }

println(conteoClases)
}


```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.dotty$tools$pc$completions$CaseKeywordCompletion$$$sortSubclasses(MatchCaseCompletions.scala:342)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:292)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:348)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:120)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Yeison/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.14/scala-library-2.13.14-sources.jar!/scala/collection/immutable/List.scala