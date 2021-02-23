package OOP.part_01_geek

object DataClass {

    //дата класс это класс который удерживает в себе данные
    //компилятор автоматически добавляет для каждого аргумента следующие методы в
    //начальный конструктор:
        //toString()
        //componentN() functions
        //equals()/hashCode() pair
    //copy function

    //ограничения на дата класс
        //у класса должен быть хотя бы один параметр
        //все параметры в первичном конструкторе должны быть промаркированы как var или val
        // т.е. быть полями класса
        //дата класс не может быть аюстрактным, открытым для наследования а так же
            //sealed или iner


    @JvmStatic
    fun main(args: Array<String>) {
        val firstOrder = Order(1,"Vanilla")
        println(firstOrder) //Order(orderNum=1, flavor=Vanilla)
        println(
            "val orderNum: ${firstOrder.component1()}" +
                    "\nval flavor: ${firstOrder.component2()}"
        )

        //Есть проблема с использованием дата классов с создванными
        //ручками свойствами, например создадим два экземпляра
        val firstOrderWithProp = OrderWithProperties(1, "Vanilla")
        firstOrderWithProp.name = "Dima"
        val secondOrderWithProp = OrderWithProperties(1, "Vanilla")
        secondOrderWithProp.name = "Katya"

        //не смотря на то что equals проверяеи по контенту получим true
        //true потому что компилер создает equals только для свойств которые были
        //декларированы в конструкторе и не будет проверять name который был создан внутри класса
        println("firstOrderWithProp.equals(secondOrderWithProp): " +
                "${firstOrderWithProp.equals(secondOrderWithProp)}")

        //Функция copy позволяет создавать полную копию тоже без внутреннего свойства
        var newOrder = firstOrderWithProp.copy()
        println("newOrder = $newOrder and newOrder.name: ${newOrder.name}")
        //Можно в процессе копирования менять параметры
        newOrder = firstOrderWithProp.copy(flavor = "Caramel")
        newOrder.name="Только если присвоим"
        println("newOrder = $newOrder and newOrder.name: ${newOrder.name}")

        //Data Class - destruction - позволяет разбивать класс на переменные
        val(orderNum, flavor) = newOrder
        println("orderNum: $orderNum, flavor: $flavor ")
    }

    //Класс даннных
    data class Order(val orderNum: Int, val flavor: String)

    //Можно так же создавать свойства класса декрарируя их внутри класса
    data class OrderWithProperties(val orderNum: Int, val flavor: String){
        var name: String = ""
    }
}