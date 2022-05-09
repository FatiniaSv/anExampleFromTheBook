import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates

//example of using delegation
open class PropertyChangeAware{
    protected val changeSupport =PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener : PropertyChangeListener){
        changeSupport.addPropertyChangeListener { listener }
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener){
        changeSupport.removePropertyChangeListener { listener }
    }
}



class PersonDelegate(val name : String, age : Int, salary : Int): PropertyChangeAware(){
    var age : Int = age
        set(newValue){
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }
    var salary : Int  = salary
        set(newValue){
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}
/*class PersonDelegate2(val name :String, age : Int, salary: Int) : PropertyChangeAware(){

    private val observer={
        prop : KProperty<*>, oldValue : Int, newValue : Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age : Int by Delegates.observable(age , observer)
    var salary : Int by Delegates.observable(salary, observer)
}*/

fun main(){
    val pers = PersonDelegate("Dmitry", 35, 2000)
    pers.addPropertyChangeListener(PropertyChangeListener { event -> println("Property ${event.propertyName} changed" +
            "from ${event.oldValue} to ${event.newValue}") })
    pers.age = 36
    pers.salary = 5000
   // val pers2 = PersonDelegate2("Sveats", 42, 1000)
    //pers2.age = 43
}