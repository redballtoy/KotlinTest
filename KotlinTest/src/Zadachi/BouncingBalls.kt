package Zadachi

//https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/kotlin

object BouncingBalls {
    @JvmStatic
    fun main(args: Array<String>) {
        println("${
        bouncingBall(3.0,0.66,1.5)}")
    }

    fun bouncingBall(h:Double, bounce:Double, window:Double):Int {
        if(h>window && (bounce>0 && bounce <1) ){
            var t: Double =h*bounce
            var count: Int = 1
            while(t>window){
                count+=2
                t*=bounce

            }
            return count
        }else{return -1}
    }
}