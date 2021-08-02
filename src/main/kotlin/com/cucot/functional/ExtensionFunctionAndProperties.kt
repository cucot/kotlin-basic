package com.cucot.functional

class ExtensionFunctionAndProperties {
}

/**
 * Kotlin lets us add new members to any class with the extensions mechanism. There are 2 types of extensions:
 * 1. extension functions
 * 2. extension properties
 */

data class Item(val name: String, val price: Double)

data class Order(val items: Array<Item>)

// member function extension

fun Item.showOff() = println("Item name: ${this.name} and item price: ${this.price}")

fun Order.maxPricedItem(): Item? = this.items.maxByOrNull { it -> it.price }


fun main() {
    val kevinHat = Item("Hat by Justine Bieber", 1000.0)
    val joeHat = Item("Hat by Joe", 50.0)
    val firstOrder = Order(arrayOf(kevinHat, joeHat))
    kevinHat.showOff()
    println(firstOrder.maxPricedItem())
}
