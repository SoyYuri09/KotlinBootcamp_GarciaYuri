//Yuri Germán García López - 252583
//Subclase curry
class Curry(
    name: String,
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {

    //Implementación del método grind()
    override fun grind() {
        println("Grinding the curry into powder")
    }

    //Implementación del método abstracto prepareSpice()
    override fun prepareSpice() {
        grind()
        println("Curry is prepared")
    }
}