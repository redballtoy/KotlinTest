package OOP.part_01_geek

object Workshop_00_06 {

    //Добавь в data class 2-4 свойства.
    data class VideoGame(
        val name: String,
        val year: Int,
        val genre: Genre //добавлено позже
    )

    //Создай "enum class", назови его "Genre", добавь в него несколько вариантов значений.
    //  Добавь его, как новое свойство класса "VideoGame".
    //  Поправь созданные сущности видеоигр в коде коде воркшопа.
    //  Запусти выполнение функции "main()" и посмотри результат.
    enum class Genre {
        STRATEGY,
        RACING,
        ACTION
    }


    //Создай объект "VideoGamesTest", который будет использоваться для тестирования игр.
    object VideoGameTest {
        @JvmStatic
        fun main(args: Array<String>) {

            //Создай экземпляр класса "VideoGame".
            val game = VideoGame("Герои меча и магии", 1999, Genre.STRATEGY)

            //Создай копию игры с помощью функции ата класса ".copy()",
            // сохрани копию в другой переменной.
            val copy = game.copy()

            //Выведи в консоль результат сравнения игры и её копии, используя оператор
            // сравнения "==". Результат должен быть типа Boolean "true".
            val equal = game == copy
            println("equal = game==copy: $equal")

            //Создай массив игр. В момент создания, наполни его несколькими играми
            // и массив в консоль.
            val games = arrayOf(
                game,
                game.copy(name = "Герои 4", year = 2002, Genre.STRATEGY),
                VideoGame("Diablo I", 1998, Genre.ACTION)
            )
            games.forEach { println(it) }
        }
    }
}