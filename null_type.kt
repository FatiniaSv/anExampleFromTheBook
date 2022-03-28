class Address(val streetAddress : String, val zipCode : Int, val city : String, val country  : String )
class Company (val name : String, val address : Address?)
class Persons (val name : String, val company : Company?)

fun Persons.countryName() : String{
    val country = this.company?.address?.country
    return if(country != null) country else "Unknown"
}

fun main(){
    val jake = Persons("Jake", null)
    val addressAgat = Address("Shosse", 1, "Moscow", "Russia")
    val agat = Company("Agat", addressAgat)
    val sveta = Persons("Sveta", agat)

    println("Country of ${jake.name}, ${jake.countryName()}")
    println("Country of ${sveta.name}, ${sveta.countryName()}")
}