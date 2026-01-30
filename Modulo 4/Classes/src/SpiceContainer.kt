//Yuri Germán García López - 252583
//Clase que contiene una especia y genera una etiqueta con su nombre
data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}