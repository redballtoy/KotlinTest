package Collections

// Workshop #7 - list, mutable list, useful functions, maps
object workshop_00_07 {
    val poem = arrayOf(
        "Истинное счастье доступно",
        "Лишь только тогда, когда всё хорошо",
        "Я не верю что добро существует",
        "На самом деле",
        "Реальность",
        "Определяет",
        "Восприятие",
        "Ничто мне неподвластно",
        "И я никогда не скажу что",
        "Сегодня был прекрасный день"
    )

    val weatherMap = mutableMapOf(
        "Moscow" to 2,
        "St. Petersburg" to -1,
        "Minsk" to 4
    )
    @JvmStatic
    fun main(args: Array<String>) {

        //1: Распечатай "poem" в двух вариантах:
        // 1. Только отфильтрованные строки длиной короче 12 символов;
        val filtered = poem.filter { it.length < 12 }
        println("\nfiltered = poem.filter { it.length<12 } = ${filtered}")
        // 2. Все строки в обратном порядке.
        val reversed = poem.reversed()
        println("Reversed: ")
        reversed.forEach { println(it) }

        //2
        //  Инициализируй переменную с коллекцией чисел "evenList"
        //  и добавь в неё только чётные числа в диапазоне от 0 до 50, включая 0.
        var evenList = mutableListOf<Int>()
        for (i in 0..50) {
            if (i % 2 == 0) {
                evenList.add(i)
            }
        }
        println(evenList)
        //второй крутой вариант
        evenList=mutableListOf<Int>()
        for (i in 0..50 step 2) {
            evenList.add(i)
        }
        println(evenList)


        //3. В погодную карту "weatherMap" добавь погоду в "Kiev" и в "Tel-Aviv".
        weatherMap["Kiev"]=6
        weatherMap["Tel-Aviv"]=20
        println(weatherMap)

        //4. Отфильтруй и выведи в консоль города с погодой выше +0С.
        //  Вызывай операторы один за другим, в виде "цепи" (chaining operators).
        weatherMap.filter {
            it.value>10
        }.forEach {
            println("Город: ${it.key} имеет температуру ${it.value}")
        }

    }
}
