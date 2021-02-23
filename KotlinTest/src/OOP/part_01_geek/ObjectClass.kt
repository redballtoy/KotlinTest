package OOP.part_01_geek


//Object это синглтон в Котлине
    //вся его инициализация является потокобезопасной - thread safe
    //в отличие от синглтона не будет создаваться сразу а создается только при первом запросе
        //lazily initialized
    //функции и переменные внутри него вызываются напрямую как в статичном классе

object ObjectClass {
    //может иметь какие то методы которые будут выполняться с указанием имени объекта
    fun giveMeMyIceCream() {
        println("Пожалуйства, вот твое мороженное")
    }
}

fun main() {
    //Вызов похож на вызов статичного класса
    ObjectClass.giveMeMyIceCream()
}