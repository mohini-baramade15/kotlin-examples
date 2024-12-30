class ArrayExample {

}
fun main(){
    val a= arrayOf(1,2,3,4)
    //a=a.plus(5)  //not possible as "a" is declared as val

    var b= arrayOf(1)
    b+=0
    b=b.plus(10)

    println(a.contentToString()) //prints [1, 2, 3, 4]
    println(a.joinToString())  //prints 1, 2, 3, 4

    var ab= arrayOf<Int>() //empty array
    //var ab= arrayOf(); //need to declare type or add elements
    val x= ab.firstOrNull();
    val y= b.lastOrNull();

    println("x: $x")
    println("y: $y")
}