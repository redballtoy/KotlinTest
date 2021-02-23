package variables

fun main() {
    val someClass = SomeClass()
    println("${someClass.mGetFullName()}")
}

//Переменные и функции можно определять в любом месте
val applicationName = "appName"

fun getFullName(packageName: String, appName: String) = (packageName + applicationName)

class SomeClass {
    fun mGetFullName() = getFullName(packageName = "com.example.", appName = applicationName)
}

