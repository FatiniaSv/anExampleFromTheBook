class PersonNew(val firstName: String, val lastName: String): Comparable<PersonNew>{
    override fun compareTo(other: PersonNew): Int {
        return compareValuesBy (this, other, PersonNew::lastName, PersonNew::firstName )
    }
}

fun main(){
    val per1 = PersonNew("Sveta","Tretyakova")
    val per2 = PersonNew("Olga", "Kartunkova")
    val per3 = PersonNew("Sveta","Tretyakova")

    println(per1<per2)
    println(per1<per3)
}