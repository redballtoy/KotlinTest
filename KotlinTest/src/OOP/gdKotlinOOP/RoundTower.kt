package OOP.gdKotlinOOP

//по умолчанию классы в Kotlin являются final, поэтому что бы
//отнаследоваться от класса если он не абстрактный надо указать что он open
//при добавлении параметра в подкласс его естественно не надо указывать в
//суперклассе, таким образом добавляем в класс башни количество этажей floors
//можно сразу присвоить ему значение по умолчанию
class RoundTower(
    residents: Int,
    private val floors: Int = 2,
    radius: Double
) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea()*floors
    }
}