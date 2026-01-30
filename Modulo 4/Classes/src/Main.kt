//Yuri Germán García López - 252583
// Quiz Practice Time N.1
fun main() {
    //--Ejercicio 1--
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    //--Ejercicio 2--
    //Crear una lista de especias
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "very spicy"),
        Spice("green curry", "medium"),
        Spice("red pepper", "extremely spicy")
    )

    //Se filtran las especias que sean spicy o menos
    val mildOrSpicy = spices.filter { it.heat <= 5 }

    println("Spices that are spicy or less:")
    mildOrSpicy.forEach {
        println(it.name)
    }

    val salt = makeSalt()

    //--Ejercicio 3--
    //Crear un libro y leer algunas páginas
    val book = Book("Clean Code", "Robert C. Martin")
    book.readPage()
    book.readPage()

    // Crear un eBook y leer un par de páginas
    val ebook = eBook("Kotlin in Action", "Dmitry Jemerov", "pdf")
    ebook.readPage()
    ebook.readPage()
}

fun makeSalt(): Spice {
    return Spice("salt")
}