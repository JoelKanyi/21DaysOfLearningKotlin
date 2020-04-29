fun main() {
    var age = 18

    //if...else
    /*if(age<18)
        print("Not elegible for voting")
    else
        print("Eligible for voting")*/

    //if... else-if
    /*if (age<18)
        print("Not eligible for voting")
    else if (age>18 && age<45){
        print("Eligible for voting")
        print("Perfect")}
    else if(age>45 && age<65)
        print("About to retire")
    else
        print("Not categorised")*/


    //when

    when(age){
        in 0..17 -> print("Not Eligible for Voting")
        in 18..45 -> print("Eligle for voting")
        else -> {
            print("Not categorised")
        }
    }



}