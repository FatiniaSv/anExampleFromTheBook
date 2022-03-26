//можно использовать в лябде переменные вход
fun printMessageWithPrefix( message : Collection<String>,  prefix : String){
    message.forEach{ print("$prefix  : $it , "  ) }
}
 fun main(){
     val error = listOf("403 Forbidden", "404 Not Found")
     printMessageWithPrefix(error,"Error")
 }