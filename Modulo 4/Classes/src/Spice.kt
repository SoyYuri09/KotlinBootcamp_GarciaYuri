//Yuri Germán García López - 252583
////Clase Spice que representa una especia y un nivel de picor
//class Spice(val name: String, val spiciness: String = "mild") {
//
//    //Porpiedad heat que devuelve un número dependiendo del nivel de picor
//    val heat: Int
//        get() = when (spiciness) {
//            "mild" -> 1
//            "medium" -> 3
//            "spicy" -> 5
//            "very spicy" -> 7
//            "extremely spicy" -> 10
//            else -> 0
//        }
//
//    init {
//        println("Spice created: $name, spiciness: $spiciness, heat: $heat")
//    }
//}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    //Propiedad heat que devuelve un valor numérico según el nivel de pico
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

    // Método abstracto
    abstract fun prepareSpice()
}