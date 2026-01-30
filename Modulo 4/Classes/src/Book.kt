open class Book(val title: String, val author: String) {

    private var currentPage: Int = 0

    open fun readPage(){
        currentPage++
        println("Reading page $currentPage of '$title'")
    }
}