
fun main() {
    var number = intArrayOf(123,4,56,99,-1,11,68,23)

    for(index in 0 .. number.size){
        if (number[index] <0) break
        println(number[index])
    }
}
