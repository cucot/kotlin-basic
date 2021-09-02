package com.cucot.coursera.helloworld;

import static com.cucot.coursera.helloworld.ExtensionFunctionKt.lastChar;
import java.io.IOException;

public class CallingFromJava {

    public static void main(String[] args) {
        TopLevel.calculatedString(); // calling top-level function from kotlin
        HelloKt helloKt = new HelloKt();
        helloKt.calculatedString(); // calling object member function from kotlin
        System.out.println(DefaultArg.sumThreeNumbers(1, 2,5));
        System.out.println(DefaultArg.sumThreeNumbers(4, 5));
//        try {
//            System.out.println("Hello");
//        } catch (IOException ioException) {
//
//        }

        try {
            ExceptionHandlingKt.isSaidToThrow();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        ExceptionHandlingKt.nothingSpecial(false);

        // extension function
        String myName = "Kevin";

        System.out.println("Last char of my name is " + lastChar(myName));
    }
}
