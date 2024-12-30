class Example {
}
fun findLengthIfString(name: Any?){
    val value= name as? String
    println(value?.length)
//    if(name is String){
//        println(name.length)
//    }
}
fun main(){
    findLengthIfString(null)
}