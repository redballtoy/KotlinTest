package OOP.part_01_geek

object Inheritance {

    @JvmStatic
    fun main(args: Array<String>) {
        val crazyIce = CrazyIceCream()
        crazyIce.printFlavoir()
        crazyIce.sing("Я иду и курю Беломор Канал \n светофор подмигнул я его сломал...")

    }

    //для наследования от класса необходимо его и его параметры сделать open
    open class IceCream(
        var flavor: String = "Vanilla",
        open var cone: Boolean = true,
        override val name: String
    ) : SpecialIceCream() {
        open val cup = !cone
        val base = if (cup) "cup" else "cone"
        var isVarVanilla: Boolean
            get() = this.flavor == "Vanilla"
            set(value) {
                if (value) flavor = "Vanilla"
            }

        open fun printFlavoir() {
            println(
                "iceCreamMagic.flavor = ${this.flavor} " +
                        ", iceCreamMagic.isVanilla =${this.isVarVanilla}"
            )
        }

    }

    class CrazyIceCream() : IceCream(name = "CrazyIce"),IceCreamAction{
        //наша мороженка будет только в стаканчике
        override val cup = true
        override var cone = false
        override val name=super.name

        //добавляем в мороженое Oreo
        fun addOreo() {

        }

        //Подправляем функцию печати
        override fun printFlavoir() {
            println(
                "iceCreamMagic.name = ${this.name} "+
                "\niceCreamMagic.flavor = ${this.flavor} " +
                        ",\n iceCreamMagic.isVanilla =${this.isVarVanilla}" +
                        "\n has is cone? = ${this.cone}" +
                        "\n a has is cup? = ${this.cup}"
            )
        }

        override fun sing(words: String) {
            println("Я пою : \"$words\"!")
        }
    }

    //Абстрактный класс, определяет что он что то "has a?" и от него наследуются другие
    //любой класс который отнаследуется от specialIceCream должен будет иметь имя
    abstract class SpecialIceCream {
        //особенное мороженное должно иметь имя
        abstract val name: String
    }

    //Интерфейсы определяют  что это делает "is it" - модель поведения
    //добавляет поведения к классу, у нас мороженное которок умеет петь
    interface IceCreamAction {
        fun sing(words: String)
    }


}