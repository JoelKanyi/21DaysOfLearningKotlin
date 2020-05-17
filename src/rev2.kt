
interface School{
    fun finance()

    //a function can have its implementation unlike in java
    fun admission(){
        //implementation
    }
}

class Education : School {
    override fun finance() {
        println("You have fees arrear")
    }

}

//Generic class
class Box<T>(t:T){
    var value = t
    fun sayHolla(){
        println("Holla at $value")
    }
}

//Extension functions
fun MutableList<Int>.swap(index1:Int,index2:Int){
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main(){
    val stud1 = Education()
    stud1.finance()
    val list = mutableListOf(1,2,3)
    val box:  Box<String> = Box<String>(".Kt")
    box.sayHolla()

    val box2:  Box<Int> = Box<Int>(1)
    box2.sayHolla()

    val box3:  Box<Double> = Box<Double>(23.3)
    box3.sayHolla()
}