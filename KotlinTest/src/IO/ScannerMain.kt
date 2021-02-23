package IO

import java.util.*


//тестирование ввода с клавиатуры с использованием сканера и
//замены в случае null
fun main() {
    val notNullDefault = 0f

    print("Введите первое число: ")
    val firstDigit =MyScanner.scan.nextFloat()
    print("Введите второе число: ")
    val secondDigit =MyScanner.scan.nextFloat()
    val sum = (firstDigit ?: notNullDefault).plus(secondDigit ?: notNullDefault)
    print("Сумма двух числе составит $firstDigit + $secondDigit =  $sum")
    val ren = (firstDigit ?: notNullDefault).rem(secondDigit ?: notNullDefault)
    print("\n Деление двух числе составит $firstDigit % $secondDigit =  $ren")

}

class MyScanner{
    companion object{
        val  scan = Scanner(System.`in`)
    }
}