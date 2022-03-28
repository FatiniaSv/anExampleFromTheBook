object ExampleWith{
    fun alphabet() : String{
        val stringBuilder = StringBuilder()
        return with(stringBuilder){
            for(letter in 'A' .. 'Z'){
                this.append(letter)
            }
            append("\n Now I know the alphabet!")
            this.toString()
        }
    }

    fun alphabetRefactoring(): String = with(StringBuilder()){
        for(letter in 'A'  .. 'Z'){
            append(letter)
        }
        append("\n Now I know the alphabet!")
        toString()
    }
    fun alphabetApply():String = StringBuilder().apply {
        for(letter in 'A'..'Z'){
            append(letter)
        }
        append("\n I know alphabet")
    }.toString()

}
 fun main(){
     println(" alphabet ${ExampleWith.alphabet()}")
     println("alphabet_refactoring ${ExampleWith.alphabetRefactoring()}")
     println("alphabet_apply ${ExampleWith.alphabetApply()}")
 }