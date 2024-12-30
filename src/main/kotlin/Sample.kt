import java.lang.NullPointerException

class Person(val name:String?)
class Sample {
    fun findNameLength(person:Person?){
        //val length = person!!.name!!.length

    }
}
fun main(){
    val name: String?
    name=null

    val person:Person? =Person(null)

    val sample= Sample()
    sample.findNameLength(person)

}