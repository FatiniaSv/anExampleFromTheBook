/*The function performs an arbitrary operation with two numbers,
2 and 3, and outputs the result.*/

object ExampleHightOrderFunction{
    fun twoAndThree(operation :(Int, Int)->Int){
        val rezult = operation(2,3)
        println("rezult of function twoAndThree $rezult ")
    }
}

fun main(){
    ExampleHightOrderFunction.twoAndThree{a : Int ,b : Int -> a+b}
    ExampleHightOrderFunction.twoAndThree{a, b -> a-b}
}