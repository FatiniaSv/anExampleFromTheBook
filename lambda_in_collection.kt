
data class Person(val name : String, val age : Int)

//ищем человека с максимальным возратом
//*****

fun main(){
    val people = listOf(Person("Robert",42), Person("Anna", 17), Person("Max", 31))
    //println("${people.maxByOrNull {it.age }}")
  //  println("${people.maxByOrNull ( Person::age)}") //замена л/в на свойство,которому оно делегируют свою работу
    println("${people.maxByOrNull { p->p.age }}")//тип можно убрать если он очевиден
}
