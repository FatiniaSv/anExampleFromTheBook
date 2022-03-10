//пример использования делегирования
interface Messenger {
    fun send(message : String)
}
class ChatMessenger(val programName : String) : Messenger{
    override fun send(message: String) {
        println ("message with text '$message' was send  by ${this.programName}")
    }
}
//class SumPhone(val name : String, m :Messenger) : Messenger by m

interface PhotoDevice{
    fun takePhoto()
}

class SumPhotoCamera() : PhotoDevice{
    override fun takePhoto() {
        println("take Photo")
    }
}

class SumPhone(val name :String, m :Messenger, phone: PhotoDevice): Messenger by m, PhotoDevice by phone{
    override fun takePhoto() {
        println("take new photo '$name' ")
    }
}

fun main(){
    val telegrams = ChatMessenger("Telegrams")
    val canon = SumPhotoCamera()
    val phone = SumPhone("Apl", telegrams, canon)
    phone.send("Hello, Sveta")
    phone.takePhoto()
}