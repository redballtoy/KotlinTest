package FlowAndLogicOperators

import java.util.*

fun main() {
    //if использование
    //ifUsing()

    //when использование
    //whenUsing()

    //if expression c возмножностью присвоить результат
    val i=5
    val k = if(i in 1..4) i else 4
    println("Для i = $i, значение к = $k")

    //if c возможностью выполнения выражений по условию
    val max = if(i in 1..4){
        println("Значение валидно")
        i
    }else{
        println("Значение не валидно")
        -1
    }
    println("Для i = $i, значение к = $max")

    //for
    var evenList = mutableListOf<Int>()
    for (i in 0..50) {
        if (i % 2 == 0) {
            evenList.add(i)
        }
    }
    println(evenList)
    //второй вариант
    evenList=mutableListOf<Int>()
    for (i in 0..50 step 2) {
        evenList.add(i)
    }



}

fun whenUsing() {
    //when может получать на вход переменую
    println("When тестирование:")
    println("Введите число от 1 до 3: ")
    val inputInt = Scanner(System.`in`).nextInt()
    var msg: String = "null"
    when (inputInt) {
        1 -> msg = "Один"
        2 -> msg = "Два"
        3 -> msg = "Три"
        else -> println("Вы ввели число $inputInt и оно не в диапазоне от 1 до 3")
    }
    if (!msg.equals("null")) {
        println("Вы ввели число которое называется $msg")
    }


}

fun ifUsing() {
    //использование if
    print("Введите первое число: ")
    val a = Scanner(System.`in`).nextInt()
    println("Введите второе число: ")
    val b = Scanner(System.`in`).nextInt()
    val max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Большим из двух чисел $a и $b является число $max")
}
