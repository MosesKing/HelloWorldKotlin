import kotlin.reflect.jvm.internal.impl.load.java.Constant

fun main(args: Array<String>) {
//    variable

    var sample2 = 58
    val heartRate: Int? = 85
    var deposits: Double = 135002796.toDouble()
    var mass: Float = 14.6.toFloat()
    var distance: Double = 129.763001
    var lost = true
    var expensive = true
    var choice = 2

    // output
    // sample problem
    if (ConstantVar.sample1 == sample2){
        println("The samples are equal.")
    } else
        println("The samples are not equal.")
    // heartrate problem
    if (heartRate != null) {
        if (heartRate >= 40 && heartRate <= 80){
            println("Heart rate is normal.")
        } else
            println("Heart rate is not normal")
    }
    // deposits
    if (deposits >= 100000000){
        println("You are exceedingly wealthy")
    }else {
        println("Sorry you are so poor.")
    }
    var force: Float = mass * ConstantVar.acceleration
    println("force = $force")
    println("$distance is the distance")

    if (lost == true && expensive == true){
        println("I'm really sorry! I will get the manager!")
    } else
        println("Here is coupon for 10% off.")

    when (choice) {
        1 -> println("You chose 1")
        2 -> println("You chose 2")
        3 -> println("You chose 3")
        else -> {
            println("You made an unknown choice")
        }
    }

    for (i in 5 until 11) println("i = $i")
    var age = 0
    while (age < 6){
        println("age = $age")
        age++
    }

    println("${ConstantVar.greeting} ${ConstantVar.named}")
}

class ConstantVar {
    companion object {
        const val sample1 = 0x3A
        const val acceleration: Float = 9.800.toFloat()
        const val integral =  "\'u{222B}"
        const val greeting = "Hello"
        const val named: String = "Karen"


    }
}