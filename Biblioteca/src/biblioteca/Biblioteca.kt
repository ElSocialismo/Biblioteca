package biblioteca

// Interfaz que define una acción común para todos los libros
interface AccionLibro {
    fun leer()
}

// Clase abstracta que define los atributos comunes de un libro
abstract class Libro {
    abstract val titulo: String
    abstract val autor: String
    abstract val añoPublicacion: Int
}

// Clase que representa un libro impreso y sus detalles
class LibroImpreso(
    override val titulo: String,
    override val autor: String,
    override val añoPublicacion: Int,
    val numeroPaginas: Int
) : Libro(), AccionLibro {
    // Implementación del método leer de la interfaz
    override fun leer() {
        println("Leyendo el libro impreso '$titulo' de $autor.")
    }

    // Método para imprimir detalles del libro
    fun imprimirDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de publicación: $añoPublicacion")
        println("Número de páginas: $numeroPaginas")
    }
}

// Clase que representa un libro digital y sus detalles
class LibroDigital(
    override val titulo: String,
    override val autor: String,
    override val añoPublicacion: Int,
    val tamañoMB: Double
) : Libro(), AccionLibro {
    // Implementación del método leer de la interfaz
    override fun leer() {
        println("Leyendo el libro digital '$titulo' de $autor.")
    }

    // Método para imprimir detalles del libro
    fun imprimirDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de publicación: $añoPublicacion")
        println("Tamaño del archivo: $tamañoMB MB")
    }
}
