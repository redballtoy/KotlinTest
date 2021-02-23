package Collections

//Общие слова
    //это группы переменных размещенных по какому то смыслу
    //в котлине есть стандартные имплементации базовых коллекций
    //каждый тип коллекции имеет два свойства:
        // интерфейс только для чтения
        // mutable интерфейс с операторами которые мы можем писать

object ListMain {

    @JvmStatic
    fun main(args: Array<String>) {
        //Non mutable List
        val list = listOf(1, 5, 3, 4)
        println("list: $list")

        //Mutable List
        val mutableList = mutableListOf("an", "d", "ro", "id")
        println("mutableList: $mutableList")
        //добавление в mutable list
        mutableList.add("foo")
        println("mutableList after add: $mutableList")


        //Полезные функции для списков
            //add(element: E) - добавить значение в мутабельный список
            //remove(element: E) - удалить значение из мутабельного списока
            //reversed() - возвращает копию списка с элементами в обратном порядке
            //counains(element E) - возвращает true если в списке содержится этот элемент
            //subList(fromIndex: Int, toIndex: Int) - возвращает часть списка от начального
                //до конечного не включая конечный
                //an, d, ro, id, foo -> d, ro, id
        println("mutableList.subList(1,4): ${mutableList.subList(1,4)}")



        //суммирование
        println("list.sum(): ${list.sum()}")//все выражение надо писать в {}
        //суммирование листа стрингов как суммы длины каждой стринги (it.length)
        println("mutableList.sumBy { it.length }: ${mutableList.sumBy { it.length }}")




    }



}