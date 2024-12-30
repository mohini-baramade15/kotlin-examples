class LabelsExample {
}
fun main(){

    loop@ for(i in 1..10){
        for(j in 1..5){
            if(i==j){
                println("Exiting from inner loop")
                break
            }
            if(j==i/2){
                println("Exiting from outer loop")
                break@loop
            }
        }
        println("i: $i")
    }

    demo()

    val list=listOf(0,1,2,3,4,5,6,7)
    list.forEach for1@{
        if (it == 3) return@for1
       print(it)
    }

}
fun demo(): List<Int> {
    val x=listOf(1,2,3,4,5,6,7,8,9)
    val y= x.filter{ it>2 }
    val z=y.map { it*2 }

//    println(y)
//    println(z)

     var xy = listOf<Int>()
     xy= x
         .map { v1 -> v1 * 3 }
         .filter{ v2->
             if(v2<0){
                 return xy
             }
             else if(v2<10){
                 return@filter true
             }
             else
             {
                 return@filter false
             }
         }

    println(xy)

    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()

    println(numberList)
    return xy
}