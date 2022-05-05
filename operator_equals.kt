class Point(val x :Int, val y :Int){
    override fun equals(other: Any?): Boolean {
        if(other === this ) return true
        if(other !is Point) return false
        return (other.x == x) && (other.y == y)

    }
}

fun main(){
    val p1 : Point = Point(1,1)
    val p2 : Point = Point(2,2)
    val p3: Point = Point(1,1)
    println(p1 == p2)
    println(p1 == p1)
    println(message = p1 != p1)
}