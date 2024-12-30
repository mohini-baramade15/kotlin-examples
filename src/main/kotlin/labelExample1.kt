class labelExample1 {

}
fun main(){

    loop@ for(i in 1..5){
        for(j in 1..3){

//            if(i!=j){
//                println("exiting from inner loop")
//                break
//            }

            if(j==i/2){
//                println("Exiting from outer loop")
                break@loop
            }
        }
//        println("i : $i")
    }

    val list =listOf(1,2,3)

    list.forEach for1@{
        if(it ==2){
            return@for1
        }
        println(it)
    }
}