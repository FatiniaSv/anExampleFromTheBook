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

fun main(){
    val but = Button()
    but.click()
    but.setFocus(b = true)
    but.showOff()
}

