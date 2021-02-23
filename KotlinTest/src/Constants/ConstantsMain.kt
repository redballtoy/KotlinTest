package Constants

object ConstantsMain {

    const val primeMinister = "Bibi"

    //Иерархия файла в котлине файл является топ объектом
    // может быть нескоко классов в одном файле
    // могут быть функции не относящиеся ни к одному классу
    // константы с val могут создаваться только в топ объектах, в классе не получится
    class MyClass {
        //const val primeMinister = "Bibi" не получится
        //если мы хотим использовать константы в контексте класса необходимр использовать companion object
        //это типа статических констант класса
        companion object {
            const val primeMinister = "Bibi"
        }
    }

    //Вызов этого параметра будет соответственно происходить
    @JvmStatic
    fun main(args: Array<String>) {
        println("MyClass.primeMinister:  ${MyClass.primeMinister}")

    }


}