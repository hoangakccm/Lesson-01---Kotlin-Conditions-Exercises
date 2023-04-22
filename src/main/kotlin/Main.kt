import java.util.*
import kotlin.math.sqrt

fun baitap1() {
    println("Enter a number: ")
    val number = readln()!!.toInt()
    val result =
        if (number > 0)
            "So $number la so duong"
        else if (number < 0)
            "So $number la so am"
        else
            "So $number la so 0"
    println(result)
}

fun baitap3() {//giai phuong trinh bac 2: ax^2 +bx+c =0
    println("Enter a,b,c: ")
    val a = readln()!!.toInt()
    val b = readln()!!.toInt()
    val c = readln()!!.toInt()
    val delta = b * b - 4 * a * c
    val x: Int
    if (delta < 0)
        println("phuong trinh vo nghiem")
    else if (delta == 0)
        println("phuong trinh co 1 nghiem: x = " + (-b / (2 * a)))
    else
        println(
            "phuong tring co 2 nghiem: \n x1 = ${(-b + sqrt(delta.toDouble())) / (2 * a)}" +
                    "\n x2 = ${(-b - sqrt(delta.toDouble())) / (2 * a)}"
        )
}

fun baitap4() {
    println("Enter a,b,c: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    var max = a
    if (max < b)
        max = b
    else if (max < c)
        max = c
    else
        max = a
    println("Max is $max")

}

fun baitap5() {
    println("Enter a number 1-7")
    val number = readln()!!.toInt()
    val day = when (number) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid"
    }
    println(day)
}

fun baitap6() {
    println("Enter 3 number: ")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(
        "Enter calculation option 1-5: " +
                "\n(1) In số lớn nhất\n" +
                "(2) In số nhỏ nhất\n" +
                "(3) Chỉ in ra số âm\n" +
                "(4) Chỉ in ra số dương\n" +
                "(5) Exit\n"
    )
    val number_option = readln().toInt()
    when (number_option) {
        1 -> {
            var max =
                if (a > b && a > c) a
                else if (b > a && b > c) b
                else c
            println(max)
        }//max
        2 -> {
            var min =
                if (a < b && a < c) a
                else if (b < a && b < c) b
                else c
            println(min)
        }//min
        3 -> {
            if (a < 0) {
                println("So a am")
            }
            if (b < 0) {
                println("So b am")
            }
            if (c < 0) {
                println("So c am")
            }
            if(a>=0 && b>=0 && c>=0)
                println("Khong co so am")


        }//so am
        4 -> {
            if (a > 0) {
                println("So a duong")
            }
            if (b > 0) {
                println("So b duong")
            }
            if (c > 0) {
                println("So c duong")
            }
            if(a<=0 && b<=0 && c<=0)
                println("Khong co so duong")
        }//so duong
        5 -> {
            return
        }//Exit
        else -> println("Invalid")
    }
}
fun baitap7(){
    val domain = "@gmail.com"
    println("Enter a email address: ")
    val email_address = readln().trim()
    val regex = Regex("[a-zA-Z0-9._-]+$domain")
    var check = regex.matches(email_address)
    if (check) {
        println("Valid gmail name")
    } else {
        println("Invalid gmail name")
    }


}
fun main() {
    //println("Hello World!")
    //baitap1()
    //baitap3()
    //baitap4()
    //baitap5()
    //baitap6()
    baitap7()
}