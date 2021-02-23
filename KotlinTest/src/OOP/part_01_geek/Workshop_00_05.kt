package OOP.part_01_geek

// Workshop #5 - inheritance, abstract, interface
object Workshop_00_05 {

    @JvmStatic
    fun main(args: Array<String>) {
        //тестирование велосипеда
        val bicycle: Transport = Bicycle()
        bicycle.drive()
        //тестирование автобуса
        val bus: Bus = Bus()
        bus.drive()
        bus.carryPassengers()



    }


    //Объявляем интерфейс представляющий определенное свойство транспорта
    interface Drivable {
        fun drive()
    }

    //Объявим базовый класс пассажирского транспорта
    //Данному классу придпдим свойство перемещаться под управлением водителя
    abstract class Transport(protected var passengersCount: Int) : Drivable

    //Создадим реальный транспорт велосипед он может управляться водителем и перевозит
    //одного пассажира
    class Bicycle : Transport(1) {
        override fun drive() {
            println("Еду на велосипеде")
        }
    }

    //Создай свой интерфейс - контракт, который бы также подошел по смыслу классу транспорт
    interface CarryPassengers {
        fun carryPassengers()
    }

    // Создай свои собственные классы, например "Bus" и "Car".
    //  Эти классы не будут полностью написаны с нуля, они должны расширять общий класс "Transport",
    //  и дополнительно реализовывать придуманный тобой интерфейс.
    class Bus : Transport(25), Drivable, CarryPassengers {
        override fun drive() {
            println("Это автобус и он может перевозить людей")
        }

        override fun carryPassengers() {
            println("Этот автобус перевозит $passengersCount пассажиров")
        }

    }


}