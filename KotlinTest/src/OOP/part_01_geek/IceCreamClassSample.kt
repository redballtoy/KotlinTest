package OOP.part_01_geek

fun main() {
    val vanilla = IceCreamCone()
    println("У этого мороженного вкус ${vanilla.flavor} и есть стаканчик ${vanilla.cone} ")
    //Вариант Шоколадного мороженного в стаканчике
    val chocolateCone = IceCreamCone("Chocolate")
    println("У этого мороженного вкус ${chocolateCone.flavor} и есть стаканчик ${chocolateCone.cone} ")
    //для указания к какому аргументу относится параметр нужно указывать его название
    //в случае когда могут быть разночтения к какому параметру применять
    val plombir = IceCreamCone(cone = false)
    println("У этого мороженного вкус ${plombir.flavor} и есть стаканчик ${plombir.cone} ")

    //мороженное с кучей опций
    val iceCreamC2 = IceCreamC2()
    println(
        "\nflavor: ${iceCreamC2.flavor}" +
                "\ncone: ${iceCreamC2.cone}" +
                "\ncup: ${iceCreamC2.cup}" +
                "\nbase: ${iceCreamC2.base}" +
                "\nflavourstring: ${iceCreamC2.flavourstring}" +
                "\nFlavormessage: ${iceCreamC2.getFlavormessage}" +
                "\nisVanilla?: ${iceCreamC2.isVanilla}"
    )

    //Магия isVarVanilla
    //меняем вкус на шоколад
    val iceCreamMagic = IceCreamC2("Chockolate")
    //выводим что поменялось
    iceCreamMagic.printFlavoir()
    //а теперь при смене isVanilla мы поменяем flavour на значение по умолчанию
    iceCreamMagic.isVarVanilla=true
    iceCreamMagic.printFlavoir()





}


class IceCreamClassSample(flavor: String, cone: Boolean) {
    var flavor: String = flavor
    val cone: Boolean = cone
}

//в котлине можно указав val var в параметрах сразу присвоить их аналогичным полям класса
//properties, помимо этого генерируются геттеры и сеттеры
class IceCream(var flavor: String, val cone: Boolean)

//можно так же добавлять значения по умолчанию
//Например по умолчанию будет создаваться ванильное мороженное в вафельном стаканчике
class IceCreamCone(var flavor: String = "Vanilla", val cone: Boolean = true)

//можно декларировать любые поля - properties
class IceCreamC2(var flavor: String = "Vanilla", val cone: Boolean = true) {
    val cup = !cone//если нет вафельного стаканчика пускай хотя бы будет чашечка

    //можем так же миксовать и создавать expressions
    val base = if (cup) "cup" else "cone"
    val flavourstring = "I taste like $flavor"

    //созданное поле всегда должно быть проинициализировано
    private val flavormessage: String

    init {
        flavormessage = "I taste like $flavor too"
    }

    //получение геттера
    val getFlavormessage: String get() = this.flavormessage

    //можно создать логику на основе геттера
    val isVanilla: Boolean get() = this.flavor == "Vanilla"

    //если хочется переопределять поле то можно задать var но тогда
    //его надо проинициализировать
    var isVarVanilla: Boolean
        get() = this.flavor == "Vanilla"
        set(value) {
            if (value) flavor = "Vanilla"
        }
    fun printFlavoir() {
        println(
            "iceCreamMagic.flavor = ${this.flavor} " +
                    ", iceCreamMagic.isVanilla =${this.isVanilla}"
        )
    }
}




