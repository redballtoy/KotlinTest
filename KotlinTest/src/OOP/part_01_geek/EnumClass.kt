package OOP.part_01_geek


enum class EnumClass {
}
enum class Direction{
    NORTH,
    SOUTH,
    WEST,
    EAST
}

//можно миксовать с properties
enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
