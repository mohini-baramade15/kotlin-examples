enum class Colour1{
    RED, GREEN, BLUE
}
class WhenExample {
    fun getColour1():Colour1{
        return Colour1.GREEN
    }

    fun execute(){
        val colour1=getColour1()
        when(colour1){
            Colour1.RED-> println("Colour1 is red")
            Colour1.GREEN -> println("Colour1 is green")
            Colour1.BLUE -> println("Colour1 is blue")      //else not required as all branches are covered
        }

        when(colour1){
            Colour1.RED, Colour1.BLUE-> println("Colour1 is red")
            else -> println("Colour1 is not red or blue")  //else is required as all branches are not covered
        }
        val x=0
        val y=1
        //working as if-else if chain
        when{
            x==0->println("x is zero")
            y!=0->println("y is not zero")
            else-> println("x is $x, y is $y")
        }
    }
}
fun main(){
//   val eg= WhenExample()
//    eg.execute()
}