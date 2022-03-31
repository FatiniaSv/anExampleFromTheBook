import java.io.BufferedReader
import java.io.StringReader

class CollectionAndNull {

    fun readNumbers(reader : BufferedReader): List<Int?> {
        val result  = ArrayList<Int?>()
        for(line in reader.lineSequence()){
            try{
                val number = line.toInt()
                result.add(number)
            }
            catch ( e : NumberFormatException){
                result.add(null)
            }
        }
        return result
    }
    fun addValidNumbers( numbers : List<Int?>){
        var sumOfValidNumbers : Int = 0
        var invalidNumbers : Int =0
        for (number in numbers){
            if(number != null)
               sumOfValidNumbers+=number
            else
                invalidNumbers++
        }
        println("Sum Valid Numbers is $sumOfValidNumbers")
        println("Count invalid number id $invalidNumbers")


    }
}

fun main(){

    val testClass  = CollectionAndNull()
    val testList = listOf<Int?>(6,2,3,0,0,4,5)
    val bufer = BufferedReader(StringReader("1/nabc/42"))
    val testList1 = testClass.readNumbers(bufer)
    testClass.addValidNumbers(testList)
    testClass.addValidNumbers(testList1)
}