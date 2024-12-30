class Practice {

    fun function(shape:Shape?){
        print(shape?.s?.length)
    }

}

fun returnValue(): String? {

    return null
}
fun main(){
    val demo=Practice()
    val shape: Shape?=null//= Shape(null)
    demo.function(shape)

    val b=shape!!.s

    val x:Int
    val y:Any?
    y=returnValue()

//    y=null
//    x= y as Int

    val a: String?=y as String?
}