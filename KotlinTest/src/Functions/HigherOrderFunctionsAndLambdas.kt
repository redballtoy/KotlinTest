package Lambdas

//Higher-Order Functions and Lambdas
//Функции высшего порядка и лямбды
fun main() {
    // в котлине функции такие же как классы
    //- могут сохраняться в переменных и структурах данных
    //- можем передавать их как параметры
    // - может быть nullable ((T)->Int)?) часто используется в коллбеках,
    // - мы передаем функцию что бы ее потом кто то за нас вызвал

    //Функция высшего порядка - это функция которая в качестве последнего аргумента
    //принимает другую функцию, такой функцией как правило является лямбда выражение

    val names = listOf<String>("Bacя","Петя","Коля")
    println(names.filter { it=="Петя" })


    /*
    *    - может так же быть вложенность, когда элементом списка является список
    *   fun main (list: List<List<Int>>){
    *           list.forEach{
    *               it.forEach{
    *                   it
    *              }
    *           }
    *       }
    *
    *     - для упрощения чтения кода можно задавать имя переменной явно
    *
    *
    *
    *
    *
    * */

    //функция вывода элементов списка
    val listIntV: List<Int> = listOf(10, 20, 30)
    val myListPrint = { intList: List<Int> ->
        intList.forEach { println(it) }
    }
    myListPrint(listIntV)

    //вложенный вариант
    val listListInt: List<List<Int>> = listOf(
        listOf(10, 20, 30),
        listOf(100, 200, 300),
        listOf(1000, 2000, 3000),
    )
    val myListListPrint = { list: List<List<Int>> ->
        list.forEach {
            println()
            it.forEach {
                print("$it ")
            }
        }
    }
    myListListPrint(listListInt)

    //Для упрощения вложенного варианта используется запись
    println("\nДля упрощения вложенного варианта используется запись")
    val myListListPrintCompact = { list: List<List<Int>> ->
        {
            list.forEach { numberList ->
                numberList.forEach { number ->
                    println(number)

                }

            }
        }
    }
    myListListPrintCompact(listListInt)


}