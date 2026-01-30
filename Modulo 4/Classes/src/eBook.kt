class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    //Contador de palabras leídas
    private var wordCount: Int = 0

    //Método que permite leer, equivalente a 250 palabras
    override fun readPage() {
        wordCount += 250
        println("Reading eBook '$title' | Words read: $wordCount | Format: $format")
    }
}