package OOP.gdKotlinOOP

import kotlin.math.PI

open class RoundHut (residents: Int, val radius: Double): Dwelling(residents) {
    override val buildingMaterial= "Stram"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius

    }
}