package Arrays

object Filters {
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

    @JvmStatic
    fun main(args: Array<String>) {
        val names = arrayOf("Леша", "Вася", "Сережа")
        //вывести имена людей начинающихся на 'В'
        println(names.filter { it[0] == 'В' })
        // а так же не начинающихся на В
        println(names.filter { it[0] !== 'В' })

        //1: Распечатай "poem" в двух вариантах:
        // 1. Только отфильтрованные строки длиной короче 12 символов;
        val filtered = poem.filter { it.length < 12 }
        println("\nfiltered = poem.filter { it.length<12 } = ${filtered}")
        // 2. Все строки в обратном порядке.
        val reversed = poem.reversed()
        println("Reversed: ")
        reversed.forEach { println(it) }

    }

}