// Общие знания о переменных

fun main() {
    var language = "Kotlin"
    val  score = 95 //immutable reference - нельзя менять то на что ссылается эта переменная
                    //объект может поменяться но ссылка на этот объект не изменится

    //статическая типизация, так не прокатит
    //var iter: Int = language

    println("Изучаем $language надеюсь быстрее чем за $score лет")

    //Базовые операции
        // - что бы в результате операции получить дробное число, холтя бы одно число должно
                // быть дробным

        //println(2 * "Bye!") должен типа вывести Bye! Bye! но у меня такое не работает
    val a = 9.6
    val b = 3
    println("\n Арифметичкеские операции:")
    println("a+b == a.plus(b) = ${a.plus(b)}")
    println("a-b == a.minus(b) = ${a.minus(b)}")
    println("a/b == a.div(b) = ${a.div(b)}")
    println("a%b == a.rem(b) = ${a.rem(b)}")
    println("a..b == a.rangeTo(b) = ${a.rangeTo(b.toDouble())}")
    println("a+b == a.plus(b) = ${a.plus(b)}")

    //Пример использования суммирования с условием что первое значение должно быть земенено на 0 в случае null
    val firstNumber :Int? = 4
    val notNullAlternative = 0
    val secondNumber = 6
    val sum = secondNumber.plus(firstNumber ?: notNullAlternative)
    println(" val sum = secondNumber.plus(firstNumber ?: notNullAlternative) = $sum")



    //можно переменной присвоить функцию и потом использовать ее






}