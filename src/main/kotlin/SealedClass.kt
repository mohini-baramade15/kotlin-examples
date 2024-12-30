fun main(){

    val a= SealedClass.A()
    a.print()

    val b=SealedClass.B()
    b.print()

    //another eg
    val obj1:Fruits = Fruits.Mango(50)

    val points= findValue(obj1)
    println(points)

    var a1:String=""
    print(a1.length)

}

private fun findValue(obj1: Fruits) = when (obj1) { //benefit of sealed class now we can iterate through only class Mango and apple
    is Fruits.Apple -> obj1.value
    is Fruits.Mango -> obj1.value
}

sealed class SealedClass {
    class A: SealedClass(){
        fun print(){
            println("In A class")
        }
    }

    class B: SealedClass(){
        fun print(){
            println("In B class")
        }
    }
}

sealed class Fruits{
    class Mango(val value: Int): Fruits()
    class Apple(val value: Int): Fruits()
}
