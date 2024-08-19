package biblioteca

// Función para gestionar y mostrar detalles de los libros
fun gestionarLibros() {
    // Creación de una instancia de LibroImpreso
    val libroImpreso = LibroImpreso(
        titulo = "El Gran Gatsby",
        autor = "F. Scott Fitzgerald",
        añoPublicacion = 1925,
        numeroPaginas = 180
    )
    // Imprime detalles y realiza una acción
    libroImpreso.imprimirDetalles()
    libroImpreso.leer()

    println()

    // Creación de una instancia de LibroDigital
    val libroDigital = LibroDigital(
        titulo = "1984",
        autor = "George Orwell",
        añoPublicacion = 1949,
        tamañoMB = 2.5
    )
    // Imprime detalles y realiza una acción
    libroDigital.imprimirDetalles()
    libroDigital.leer()
}

// Función principal para ejecutar la aplicación
fun main() {
    gestionarLibros()
}
