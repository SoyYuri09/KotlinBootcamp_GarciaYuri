//Yuri Germán García López - 252583
//Clase Libro que tiene titulo, autor y año
class Book(val Titulo: String, val Autor: String, val Anio: Int) {

    //Función que regresa el título y el autor como un Pair
    fun getTituloAutor(): Pair<String, String> {
        return Pair(Titulo, Autor)
    }

    //Función que regresa el título, autor y el año como Triple
    fun getTituloAutorAnio(): Triple<String,String,Int> {
        return Triple(Titulo, Autor, Anio)
    }
}
