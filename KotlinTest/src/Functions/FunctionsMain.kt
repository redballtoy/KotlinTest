package Functions

//основная главная функция это функция запускающая программу
fun main() {
    println(testFunction())
    println(testFunction("Kotlin"))
    println(testFunctionExt(age = 49,name = "Вася"))
    //использование ввода аргументов по их именам позволит избежать ошибки
    //когда у нас в качестве аргументов две строки
    println(testFunctionExt2(tel="+1(999)452-42-89", name="Васятка"))

}

fun testFunctionExt2(tel: String, name: String): String {
    return "Добро пожаловать $name ваш телефон $tel"
}

//для параметров функции можно задавать значение по умолчанию
fun testFunction(name: String = "Android"):String {
    return "Hello "+name
}

fun testFunctionExt(name: String, age: Int): String {
    return "Hello my liebe $name, your age is $age Years Old now"
}
