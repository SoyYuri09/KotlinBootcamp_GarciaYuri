//Yuri Germán García López - 252583
package Buildings

class Building<T : BaseBuildingMaterial>(val buildingMaterial: T) {

    //Siempre se necesitan 100 materiales base
    val baseMaterialsNeeded = 100

    //Material real necesario según el tipo
    val actualMaterialsNeeded =
        buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500)
        println("Small building")
    else
        println("large building")
}