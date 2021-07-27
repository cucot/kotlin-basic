package com.cucot.specialclasses

/**
 * Sealed class let us restrict the use of inheritance
 * a sealed class can only be subclassed from inside the same package where the sealed class is declared
 */
sealed class SealedClass(val name: String)

class Cat(val catName: String): SealedClass(name = catName)

class Human(val humanName: String, val job: String): SealedClass(name = humanName)

fun greetSealedClass(mammal: SealedClass): String {
    return when (mammal) {
        is Human -> "Hello, ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
        is ExtendsSealedClass -> "Hello, ${mammal.name}"
        is ExtendsSealClassButNotInTheSameDirectory -> "Hello out liner"
        // when is exhausted already
        // a default branching (else) is not required since all cases are covered. Compiler is smart enough to detect all available implementation inside the package of sealed class
    }
}

fun main() {
    println(greetSealedClass(Cat("Tom")))
    println(greetSealedClass(Human("Kevin", "Developer")))
}
