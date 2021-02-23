package Workshops

import java.util.*
import kotlin.random.Random

fun main() {
    val upperBound = getUpperBound()
    val notNullUpperBound = upperBound ?: 10
    val randomNumber = Random.nextInt(notNullUpperBound)
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n введите число в диапаззоне от 0 до $notNullUpperBound")
        //сохраняем введенное число в userInput
        val userInput = scanner.nextInt()
        if (userInput == randomNumber) {
            println("Поздравляю! Задуманное число $randomNumber")
            break
        }else if (userInput < randomNumber) {
            print("Ваше число меньше задуманного, пожалуйста продолжаем.")
        }else{
            print("Ваше число больше задуманного, пожалуйста продолжаем.")
        }
    }
}

//дополнительная утилита
private fun getUpperBound(): Int? {
    println("Программа 1. \"Угадай число\"")
    print("Введите число в диапазоне 10..20 включительно: ")
    val scanner = Scanner(System.`in`)
    return try {
        scanner.nextInt()
    } catch (e: InputMismatchException) {
        null
    }

}