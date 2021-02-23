package OOP.gdKotlinOOP

fun main() {

    //ошибка от абстрактного класса нельзя создать экземпляр
    //val dwelling=Dwelling()

    //Создание деревянного домика
    val scuareCabin = ScuareCabin(6,35.0)

    //Вывод информации о нем
    println("\nScuare Cabin\n=============")
    println("Capacity: ${scuareCabin.capacity}")
    println("Material: ${scuareCabin.buildingMaterial}")
    println("Has room?: ${scuareCabin.hasRoom()}")

    //Упрощенный вариант с использованием with
    with(scuareCabin) {
        println("\nScuare Cabin\n=============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room?: ${hasRoom()}")
    }

    val roundHut = RoundHut(3,10.0)
   roundHut.printAboutDwelling()

    val roundTower = RoundTower(4,3,15.0)
    roundTower.printAboutDwelling()

}
