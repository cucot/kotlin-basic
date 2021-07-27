package com.cucot.specialclasses

data class UserInputDataClass(val name: String, val age: Int, val salary: Double) {
    //this is how the default equals looks like
//    override fun equals(other: Any?): Boolean {
//        return other is UserInput && other.name == this.name && other.age == this.age && other.salary == this.salary
//    }

    override fun equals(other: Any?): Boolean {
        return other is UserInputDataClass && other.name == this.name
    }
}

fun main() {
    val adminUser = UserInputDataClass("Kevin", 26, 5.5)
    val rootUser = UserInputDataClass("Kevin", 26, 5.5)
    val olderAdmin = UserInputDataClass("Kevin", 35, 15.5)
    val sshUser = UserInputDataClass("SSH", 31, 123.45)
    var nullUserDataClass: UserInputDataClass? = null
    println(adminUser == rootUser)
    println(sshUser == nullUserDataClass)
    println(nullUserDataClass == rootUser)
    println(nullUserDataClass is UserInputDataClass)
    println("Kevin equals older Kevin = ${adminUser == olderAdmin}")
    nullUserDataClass = UserInputDataClass("Wendy", 35, 31.35)

    // test toString
    println(adminUser)
    println(nullUserDataClass.hashCode())
    nullUserDataClass = null
    println(nullUserDataClass.hashCode())
    println(sshUser)
    println(sshUser.copy())
    println(sshUser.copy("Copied name"))
    println(sshUser.copy("SSH2", 29))
    println(sshUser.copy(name = "sshj", age = 31, salary = 50.5))
    println(sshUser.copy(salary = 9.5))
    println("older admin user age = ${olderAdmin.component2()}")
}