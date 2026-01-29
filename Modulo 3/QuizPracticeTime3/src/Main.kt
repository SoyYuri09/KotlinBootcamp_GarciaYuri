//Yuri Germán García López - 252583
fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy", 10))
    println(whatShouldIDoToday("happy", "sunny", 30))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {

    return when {
        mood == "happy" && weather == "sunny" && temperature > 20 ->
            "go for a walk"

        mood == "sad" && weather == "rainy" ->
            "stay in bed"

        temperature < 0 ->
            "stay inside and drink hot chocolate"

        else ->
            "Stay home and read."
    }
}