interface User{
    val nickname : String
 }
class PrivateUser (override val nickname: String) :User

class SabscribingUser(val email : String) : User{
    override val nickname: String
        get() = email.substringBefore('@')
}

fun main(){
    val name : User = PrivateUser("test@mail.ru")
    val subscribeName : User = SabscribingUser("test@mail.ru")

    println("PrivateName : ${name.nickname}")
    println("subscribeName : ${subscribeName.nickname}")

}