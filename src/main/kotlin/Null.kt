open class AnyClass(val name:String?){
    fun findLength(): Int? {
        return name?.length
    }
}

class Null {

}

fun main(){
    var name: String?
    name=null

    val object1: AnyClass

    object1=AnyClass("mohini")
    val length: Int? =object1.findLength()
}