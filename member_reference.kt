fun main(){
    val p = Person("Dmitry", 27)
    val personAgeFunction = {p : Person -> p.age}
    println("${personAgeFunction(p)}")
    val dmitryAgeFunction = p::age
    println("${dmitryAgeFunction()}")//связанная ссылка
}
