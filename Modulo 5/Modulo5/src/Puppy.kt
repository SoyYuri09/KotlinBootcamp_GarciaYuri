//Yuri Germán García López - 252583
import java.util.Random

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}