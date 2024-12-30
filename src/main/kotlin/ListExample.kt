class ListExample {

}
fun main(){
    var x= listOf(1,2,3,4)
    val y= mutableListOf(5,6,7,8)
    val z=listOf<Any>()

    x=x.plus(10)//if we want to append values to x
    x+=11 //adding 11
    y.add(9)

    print("x: $x, y: $y")
}