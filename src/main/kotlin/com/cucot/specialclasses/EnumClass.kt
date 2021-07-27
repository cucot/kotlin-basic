package com.cucot.specialclasses

class EnumClass {
}

enum class ApplicationState {
    HALTED, RUNNING,
    EXITED; // a semicolon is required in case we want to add property and method

    fun saySomething() {
        println("We're application state")
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean = this.rgb and 0xFF0000 != 0
}

fun main() {
    val currentAppState = ApplicationState.RUNNING

    val returnMessage = when (currentAppState) {
        ApplicationState.EXITED -> "App is exited"
        ApplicationState.RUNNING -> "Congratulation you get a running app"
//        ApplicationState.HALTED -> "Sorry App was halted" //compiler can infer if a when is exhaustive so you may ignore the else branching below if this line is enabled
        else -> "Sorry App was halted"
    }
    println("You app state is\n $returnMessage")
    currentAppState.saySomething()
    println(4 and 5)

    val red = Color.RED

}