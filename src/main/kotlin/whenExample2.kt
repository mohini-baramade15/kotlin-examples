enum class Colour{
    RED, BLUE, GREEN
}
class whenExample2 {
}
fun getColour():Colour{
    return Colour.BLUE
}
fun main(){

    val value=0
    when{
        value==0->println("zero")
        value==1->println("one")
        else-> println("neither 0 nor 1")
    }
}