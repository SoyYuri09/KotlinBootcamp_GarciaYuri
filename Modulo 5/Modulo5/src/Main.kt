//Yuri Germán García López - 252583
//Clase Main para probar los ejercicios del módulo 5
fun main(args: Array<String>) {
    //--Ejercicio 1--
    //Crear instancia de la clase libro
    val book = Book("Ready Player One", "Ernest Cline", 2011, 560)
    val bookTituloAutor = book.getTituloAutor()
    val bookTituloAutorAnio = book.getTituloAutorAnio()

    println("Here is your book ${bookTituloAutor.first} by ${bookTituloAutor.second}")

    println("Here is your book ${bookTituloAutorAnio.first} " +
            "by ${bookTituloAutorAnio.second} written in ${bookTituloAutorAnio.third}")

    //--Ejercicio 2--
    //Set de libros
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    //Mapa
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

    //--Ejercicio 3--
    println("Can borrow more books? ${book.canBorrow(5)}")
    book.printUrl()

    //--Ejercicio 4--
    val puppy = Puppy()
    val book2 = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book2.pages > 0) {
        puppy.playWithBook(book2)
        println("${book2.pages} left in ${book2.Titulo}")
    }

    println("Sad puppy, no more pages in ${book2.Titulo}.")
}