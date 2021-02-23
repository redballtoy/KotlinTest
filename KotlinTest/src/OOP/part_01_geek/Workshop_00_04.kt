package OOP.part_01_geek

/*
* public - видны для всех
* private - видны внутри файла класса, содержащего описание класса
* internal - видны внутри модуля
* protected - видны внутри его классов и подклассов
* */

object Workshop_00_04 {

    @JvmStatic
    fun main(args: Array<String>) {
        testBus()

    }

    //Хорошим тоном считается объявлять классы и интерфейсы внизу файла, под функциями.
    //1. класс "Bus" который в качестве аргумента будет получать число "passengersCount"
    class Bus(private val passengersCount: Int) {

        //Добавь функцию "drive", без аргументов.
        //Она должна выводить фразу "Driving N passengers to the destination",
        // где N - число пассажиров.
        fun drive() {
            println("Driving $passengersCount passengers to the destination")
        }
    }

    private fun testBus() {
        //Создайте экземпляр класса "Bus".
        val bus = Bus(17)
        bus.drive()
    }
}