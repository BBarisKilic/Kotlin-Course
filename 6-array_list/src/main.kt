fun main(){
    //array list
    val myArayList = arrayListOf("Baris", "Ulas","Oznur")
    println(myArayList[0])
    println(myArayList.get(1))

    myArayList.add("James")
    myArayList.add("Martha")
    println(myArayList.get(4))

    val myMixedArrayList = arrayListOf<Any>()
    myMixedArrayList.add(1)
    myMixedArrayList.add("Meryem")
    myMixedArrayList.add(true)

    val intArrayList = ArrayList<Int>()
    intArrayList.add(2)
    intArrayList.add(24)
    println(intArrayList.get(1))
}