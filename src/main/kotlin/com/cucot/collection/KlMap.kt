package com.cucot.collection

class KlMap {
}

fun main() {
    val mapNameAndAge = mutableMapOf("Kevin" to 26, "Edward" to 25, "Ashton" to 50)

    mapNameAndAge.forEach { name, age -> println("$name is $age years old") }

    mapNameAndAge["Huong"] = 50

    mapNameAndAge.forEach { name, age -> println("$name is $age years old") }

    mapNameAndAge["Kevin"] = 28

    mapNameAndAge.forEach { name, age -> println("$name is $age years old") }
    val immutableMap: Map<String, Int> = mapNameAndAge
//    immutableMap["Hoan"] = 50 // compiler error
    val filteredMap = mapNameAndAge.filter { entry : Map.Entry<String, Int> -> entry.value > 25 }

    println("#############################")
    filteredMap.forEach {(key, value) -> println("$key is mapped to $value")}
}