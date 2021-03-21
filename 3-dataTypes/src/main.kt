fun main() {
    //Int
    println("-----Integer-----")
    val myInteger : Int = 5
    println(myInteger / 2) //result = 2

    //Long
    println("-----Long-----")
    var myLong : Long = 100
    myLong = 30000000000000
    println(myLong/2)

    //Double and Float
    println("-----Float-----")
    val pi : Float = 3.14f
    println(pi * 2)
    println("-----Double-----")
    val myDouble = 5.0 // Default double
    println(myDouble / 2) //result = 2.5

    //String
    println("-----String-----")
    val myString : String = "Hello Kotlin"
    println(myString)
    println("Length: ${myString.length}")
    val firstName = "Barış"
    val lastName = "Kılıç"
    val name = firstName + " " + lastName
    println(name)
    val newString : String = "10"
    val anotherNewString : String = "20"
    println(newString + anotherNewString) //result = 1020

    //Boolean
    println("-----Boolean-----")
    var myBoolean : Boolean = true
    myBoolean = false
    println(myBoolean)
    println(3<5)
}