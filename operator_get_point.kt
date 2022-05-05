operator fun Point.get(index: Int) : Int{
    return when (index){
        0 -> this.x
        1-> this.y
        else ->
            throw IndexOutOfBoundsException("Invalid index")
    }
}

fun main(){
    val a = Point(1,2)
    println(a[0])
    println(a[1])
    println(a[3])
}