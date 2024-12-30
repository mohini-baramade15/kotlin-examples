class NullSafetyEg {
}
fun getFullName(firstName:String, lastName:String): String{
    return "$firstName $lastName"
}

fun main(){

    var name: String? = getFullName("mohini", "baramade")

    if(name!=null){
        println("length of name is $name.length")
    }
    name=null
    var length1=name?.length

    print("length is $length1")

    length1= name?.length?: 0



}