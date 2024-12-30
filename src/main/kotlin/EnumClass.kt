fun main(){
    val day= Day.SUNDAY
    day.printDay()

    val x=null
    val y= x?: 10
    print(y)
}

enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printDay(){
        println("Day is $this")
    }
}