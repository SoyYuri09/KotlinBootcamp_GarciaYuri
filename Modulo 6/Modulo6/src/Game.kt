//Yuri Germán García López - 252583
class Game {
    //Lista mutable de direcciones
    var path = mutableListOf(Directions.START)

    //Lambdas que agregan cada dirección
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east  = { path.add(Directions.EAST) }
    val west  = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}