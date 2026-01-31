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

    // Recibe una lambda y la ejecuta
    fun move(where: () -> Boolean) {
        where.invoke()
    }

    // Decide qué movimiento hacer según el comando
    fun makeMove(command: String?) {
        if (command == "n") move(north)
        else if (command == "s") move(south)
        else if (command == "e") move(east)
        else if (command == "w") move(west)
        else move(end)
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