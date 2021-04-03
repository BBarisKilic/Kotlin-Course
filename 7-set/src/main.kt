fun main(){
    //set
    val myArray = arrayOf(7,8,9,9,9,8,10)
    println("index 2: ${myArray[2]}")

    println(myArray.size)

    val mySet = setOf<Int>(7,8,9,9,9,8,10)
    println(mySet.size)

    //for each
    mySet.forEach {
        println(it)
    }

    val anotherSet = HashSet<String>()
    anotherSet.add("Baris")
    anotherSet.add("Baris")
    anotherSet.add("Baris")
    anotherSet.add("Kilic")

    anotherSet.forEach {
        println(it)
    }
}