package com.cucot.play.introduction

class Generics {
}

class Couple<E>(var left: E, var right: E) {

    fun showBoth() {
        println("Left is $left and right is $right")
    }

    fun swap() {
        val temp = left
        left = right
        right = temp
    }

}

fun main() {
    val myCouple = Couple("Kevin", "One Girl")
    val myOtherCouple = Couple("Kevin", "Secret Girl")
    val intCouple = Couple(50, 80)
    myCouple.showBoth()
    myCouple.swap()
    myCouple.showBoth()
    intCouple.showBoth()
    intCouple.swap()
    intCouple.showBoth()
    val dCouple: Couple<Double> = Couple(5.6, 7.8)
    dCouple.showBoth()
    dCouple.swap()
    dCouple.showBoth()
}

fun <E> makeCouple(left: E, right: E): Couple<E> {
    return Couple(left, right)
}
