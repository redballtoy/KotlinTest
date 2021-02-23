package Collections

object MapMain {
    val languagesMap = mapOf(
        "USA" to "English",
        "Spain" to "Spanish",
        "Politics" to "Bullshit"
    )

    //мутабельные мапы
    val languagesMapMut =  mutableMapOf(
        "USA" to "English",
        "Spain" to "Spanish",
        "Politics" to "Bullshit"
    )

    @JvmStatic
    fun main(args: Array<String>) {
        println(languagesMap)

        //для получения value по key
        println("languagesMap.get(\"USA\"): ${languagesMap.get("USA")}")
        //можно заменить таким индексным оператором похожим на массив
        println("languagesMap.get(\"USA\"): ${languagesMap["USA"]}")
        //получить значение по индексу или указанное дефолтное (еслм по ключу не находится)
        println("languagesMap.getOrDefault(\"Usa\",\"Hebrew\"): ${languagesMap.getOrDefault("Usa","Hebrew")}")

        //можно вызывать функцию по дефолту
        val ifNotFound = {x: String-> println("$x")}
        println(languagesMap.getOrElse("Usa"){ifNotFound("По данному ключу ничего не найдено")})
        val ifNotFound2 = {key: String-> "По данному ключу $key ничего не найдено"}
            //случай когда по ключу не найдется
        val testKey1="politics"
        println("testKey1=\"politics\": ${languagesMap.getOrElse(testKey1){ifNotFound2(testKey1)}}")
        //случай когда по ключу найдется
        val testKey2="Politics"
        println("testKey2=\"Politics\": ${languagesMap.getOrElse(testKey2){ifNotFound2(testKey2)}}")

        //Добавление данных в мутабельный мап
        languagesMapMut.put("China", "Mandarin")
        println("languagesMapMut[\"China\"]: ${languagesMapMut["China"]}")
        //второй вариант присваивания такой же []
        languagesMapMut["Russia"]="Russian"
        println("languagesMapMut[\"Russia\"]: ${languagesMapMut["Russia"]}")
        //languagesMapMut.remove("Rusia")


    }

}