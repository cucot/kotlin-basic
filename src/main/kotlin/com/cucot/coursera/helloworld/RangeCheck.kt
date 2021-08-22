package com.cucot.coursera.helloworld

class RangeCheck(val name: String, val age: Int) : Comparable<RangeCheck> {

    override fun compareTo(other: RangeCheck): Int {
        return if (this.name === other.name) this.age.compareTo(other.age) else this.name.compareTo(other.name)
    }
}

fun main() {
    val kevin = RangeCheck("Kevin", 26)
    val peter = RangeCheck("Peter", 28)
    val edward = RangeCheck("Edward", 27)

    if (edward in kevin..peter) {
        println("edward is in range of Kevin & Peter")
    } else {
        println("Edward is not in range")
    }

    val age = 25
    val elder = 45
    val younger = 10
    val exceptional = 200

    fun checkGeneration(age: Int): String {
        return when (age) {
            in 0 until 20 -> "Teenager"
            in 20 until 40 -> "Middleman"
            in 40..130 -> "Old Man"
            else -> "Out of range"
        }
    }
    println("$age is ${checkGeneration(age)}")
    println("$elder is ${checkGeneration(elder)}")
    println("$younger is ${checkGeneration(younger)}")
    println("$exceptional is ${checkGeneration(exceptional)}")
}