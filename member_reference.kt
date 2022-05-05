fun main(){
    val p = Person("Dmitry", 27)
    val personAgeFunction = {p : Person -> p.age}
    println("${personAgeFunction(p)}")
    val dmitryAgeFunction = p::age
    println("${dmitryAgeFunction()}")//связанная ссылка
}
class ImplementStr{
    fun strStr(haystack : String, needle: String): Int {

        if(needle.isEmpty()) return 0
        return if (needle in  haystack) 1
        else -1
    }
}
