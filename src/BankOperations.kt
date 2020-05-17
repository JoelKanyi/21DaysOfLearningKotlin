
class BankOperations(bal:Double) {

    var balance:Double = bal


    fun checkBalance(): Double{
        return balance
    }
    fun deposit(depo:Double){
        balance += depo
    }

    fun withdraw(withd:Int): Double{
         balance = balance-withd-10
        println("you have withdrawn shillings $withd your balance is $balance")
        return balance
    }

    fun sendMoney(phoneNo:String,amount:Int){
        balance = balance-amount-10
        println("you have sent $phoneNo shillings $amount your balance is $balance")
    }
}

fun main() {
    val user1 = BankOperations(500.00)

    user1.sendMoney("0706003891",300)
    user1.deposit(500.0)
    println(user1.checkBalance())
    println(user1.withdraw(400))
}