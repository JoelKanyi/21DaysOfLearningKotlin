
fun main(){
    var a:Int = 5
    var b:Int = 6

    //using the if statement as an expression
    var max = if(a > b) a else b



    //the when replaces the switch case
    var x:Int = 1
    when(x){
        1 -> print("x is 1")
        2 -> print("x is 2")
        else ->
            print("x is neither 1 or 2")
    }

    //using when in a ranges of options
    when(x){
        in 1..10 -> println("Number in range")
        else -> println("Number not in range")
    }

    //for loop
    //syntax
    /*
    for(item in collection) print()
    */
    for ( i in 1..10) println(i)


    //classes

    //syntax-> it has two constructors a primary and an optional secondary constructor

    //class Programmer(name:String){}

    class Person(){
        var children: MutableList<Person> = mutableListOf()

        /*constructor(name:String,parent:Person){
            parent.children.add(this)
        }*/
    }
    //creating an instance of a class
    val p1 = Person()


    //inheritance
    //by default kotlin classes are final, so as to inherit a class we must use the keyword open to the superclass
    open class Employer{
        open fun sayHello(name:String) {
            print("Hello $name")
        }
    }

    //this class overrides the sayHello function in Employer class
    class Employee : Employer() {
        override fun sayHello(name: String) {
            super.sayHello(name)
            print("this method has been overridden from the base class")
        }
    }
    //instance of the Employee class
    val emp1 = Employee()

    emp1.sayHello("Joel")
}