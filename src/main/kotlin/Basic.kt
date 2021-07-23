fun main() {
    val myName = "Nguyen Nhu Phuc" // unchangeable variable with type inference, kinda similar to final in Java
    var arbitraryName: String = "Random name" // changeable variable with explicit type declaration
    arbitraryName = "New random name" // change the previous name to another value
    println(myName)
    println("My name is $arbitraryName")
}