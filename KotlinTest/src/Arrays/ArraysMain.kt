package Arrays

fun main() {

    //можно создавать типизироыванные массивы
    val numbers = intArrayOf(10, 20, 30)

    //нетипизированный массив ArrayOf в который можно положить все что угодно
    val notOnlyNumbers = arrayOf(10,20,30, "Edem")

    //итерация по элементам массива
    for (notOnlyNumber in notOnlyNumbers) {
        println("notOnlyNumber = $notOnlyNumber")
    }

    //для вывода еще и индекса массива
    println("\nдля вывода еще и индекса массива")
    for ((index, value) in notOnlyNumbers.withIndex()) {
        println("notOnlyNumbers.withIndex = \tindex = $index, \tvalue = $value")
    }



}