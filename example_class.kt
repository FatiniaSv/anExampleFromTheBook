//interface and class

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable")
}
interface Focusable{
    fun setFocus(b : Boolean) = println("I ${if (b) "god" else "lost"} focus.")
    fun showOff() = println("I'm focusable")
}
class Button : Clickable, Focusable{
    override fun click() {
        println("I'm button click")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

// sealed class
sealed class Expr{
    class Num (val value :  Int):Expr()
    class Sum (val left :Expr,val right :Expr):Expr()
}

fun eval (e : Expr) :  Int =
     when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }


fun main(){
    val but = Button()
    but.click()
    but.setFocus(b = true)
    but.showOff()

    println("test eval ${eval(Expr.Num(4))+eval(Expr.Sum(Expr.Num(2),Expr.Num(2)))}")
}

