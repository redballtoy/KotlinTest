package Zadachi

//https://www.codewars.com/kata/566be96bb3174e155300001b

object BallUpwards {
    @JvmStatic
    fun main(args: Array<String>) {
        println(maxball(45))
        println(maxBallFromSite(45))

    }

    fun maxball(v: Int): Int {
        val velosityMS = v * 1000.0 / 3600.0
        val g = 9.81
        var prevoisHeight: Double = 0.0
        var currentHeight: Double = 0.0
        var time: Int = 0
        while (prevoisHeight <= currentHeight) {
            time++
            prevoisHeight = currentHeight
            currentHeight = velosityMS * (time * 0.1) - 0.5 * g * (time * 0.1) * (time * 0.1)

        }
        return time - 1
    }

    fun maxBallFromSite(v0:Int):Int {
        return Math.round((v0 / 3.6).toDouble() / 0.981).toInt()
    }
}