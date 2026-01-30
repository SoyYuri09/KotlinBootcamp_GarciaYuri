//Yuri Germán García López - 252583
//Clase Main para probar los ejercicios del módulo 5
fun main(args: Array<String>) {
    //--Ejercicio 1--
    //Crear instancia de la clase libro
    val book = Book("Ready Player One", "Ernest Cline", 2011)
    val bookTituloAutor = book.getTituloAutor()
    val bookTituloAutorAnio = book.getTituloAutorAnio()

    println("Here is your book ${bookTituloAutor.first} by ${bookTituloAutor.second}")

    println("Here is your book ${bookTituloAutorAnio.first} " +
            "by ${bookTituloAutorAnio.second} written in ${bookTituloAutorAnio.third}")

}