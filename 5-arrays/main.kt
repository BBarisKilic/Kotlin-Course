fun main(){
    //arrays
    val myArray = arrayOf("Baris", "Ulas", "Oznur")
    println(myArray[0])
    println(myArray.get(1))
    
    myArray[2] = "James"
    println(myArray.get(2))

    myArray.set(2, "Oznur")
    println(myArray.get(2))

    val myArrayOfDouble = doubleArrayOf(1.0,2.0,3.0)
    println(myArrayOfDouble.get(0))

    val myMixedArray = arrayOf("Baris", 24, 16.5, false)
    println(myMixedArray.get(3))
}