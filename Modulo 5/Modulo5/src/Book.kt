//Yuri Germán García López - 252583
//Clase Libro que tiene titulo, autor y año

//Constante que almacena el número máximo de libros que una persona puede tomar prestados
const val MAX_NUMBER_BOOKS = 20

class Book(val Titulo: String, val Autor: String, val Anio: Int, var pages: Int) {

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }


    //Función que regresa el título y el autor como un Pair
    fun getTituloAutor(): Pair<String, String> {
        return Pair(Titulo, Autor)
    }

    //Función que regresa el título, autor y el año como Triple
    fun getTituloAutorAnio(): Triple<String,String,Int> {
        return Triple(Titulo, Autor, Anio)
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(Constants.BASE_URL + Titulo + ".html")
    }
}

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) =
    if (pages >= torn) pages -= torn else pages = 0