//Yuri Germán García López - 252583
//Clase Main para probar los ejercicios del Módulo 6
fun main() {
    //--Ejercicio 1--
    //Instancia de la clase game
    val game = Game()

    //Imprime el path inicial
    println(game.path)

    //Movimientos
    game.north()
    game.south()
    game.east()
    game.west()

    //Termina el juego
    game.end()

    //Imprime el path final
    println(game.path)

    //--Ejercicio 2--

}