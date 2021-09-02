@file:JvmName("DefaultArg")
package com.cucot.coursera.helloworld

@JvmOverloads
fun sumThreeNumbers(first : Int = 0, second: Int = 0, third :Int = 0 ) = first + second + third

//fun sumThreeNumbers(first : Int = 0, second: Int = 0) = first + second + 0