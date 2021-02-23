package NullSafety

/*Случаи возможного появления NPE
    - сдеоаем это сами используя !! для переменной которая получит null
        - !!
    - из за внешних библиотек или кода Java в котором эта фича отсутствует
    - из за неконсистентности данных, например в процессе сериализации JSON
*/

fun main() {


//Для использования Null Savety необходимо явно указаьб какая у нас будет переменная
//например переменная которая може быть null
var a: String? = null
    println(a)


    // в переменную которая обозначена как not nullable просто так проложить значение которое может

    //стать null не получится, в этом прикол что это правило действует на всей цепочке
    //var b: String = a //так не прокатит

    //если только так но это вызовет NPE
    //var b:String= a!! //Exception in thread "main" java.lang.NullPointerException

//Способы работать с Null Safety
    //- на этапе написания программы надо задумываться может переменная быть null или нет

    //использование Safe Call Operator ?
    val c: String? = null
    var blenght = c?.length
    var str: String? = "строка"
    println("blenght = $blenght") //blenght = null

    val m = blenght
    println("m = $m") //m = null

    //Elvis Operator
    // если оператор нулевой то используется какое то значение по умолчанию, если не нулевой то его значение
    //если все хорощо давай что сдева если null тогда то что справа
    println("blend?:-99 = ${blenght?:-99}") //когда null -  blend?:-99 = -99
    blenght=str?.length
    println("blend?:-99 = ${blenght?:-99}")//когда не null - blend?:-99 = 6








}

