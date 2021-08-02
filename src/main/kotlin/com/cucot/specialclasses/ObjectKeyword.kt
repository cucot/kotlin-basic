package com.cucot.specialclasses

class ObjectKeyword {
    companion object Friend {
        fun greeting(greetee: String) {
            println("Hello, warmly welcome $greetee to our team")
        }
    }
}

fun createAndShow() {

    // object expression
    val  temporaryWrappedObject = object {
        val name = "Kevin"
        var age = 26
        var speciality = 5.6
    }

    println(temporaryWrappedObject.age)
    temporaryWrappedObject.age++
    println(temporaryWrappedObject.age)
}

object DoAuth {
    fun notifyAuthenticated(username: String, password: String) {
        println("You're authenticated now with $username/$password")
    }
    const val name = "Ke Van Vin"
    const val age = 26
    var notAConstant = 6.5

}

fun main() {
    createAndShow()
    DoAuth.notifyAuthenticated("Kevin", "no-more-password")
    println(DoAuth.age)
    println(DoAuth.notAConstant)
    ObjectKeyword.greeting("Kevin")
}