package com.cucot.coursera.helloworld;

import org.coursera.helloworld.DefaultArg;


public class CallingFromJava {

    public static void main(String[] args) {
        TopLevel.calculatedString(); // calling top-level function from kotlin
        HelloKt helloKt = new HelloKt();
        helloKt.calculatedString(); // calling object member function from kotlin
        System.out.println(DefaultArg.sumThreeNumbers(1, 2,5));
        System.out.println(DefaultArg.sumThreeNumbers(4, 5));
    }
}
