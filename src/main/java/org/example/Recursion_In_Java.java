package org.example;

public class Recursion_In_Java {
    public static void sayHi(int count){
        System.out.println("Hello there");
        if (count <= 1){
            return;
        }
        sayHi(count - 1);
    }
}
