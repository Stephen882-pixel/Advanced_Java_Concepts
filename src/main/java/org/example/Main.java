package org.example;

import static org.example.Factorial.factorial;

public class Main {
    public static void main(String[] args) {
        Calclator obj = new Calclator();
        obj.addNumbers(10,30);
        obj.addNumbers(13.567,10,10);

        Factorial factorial = new Factorial();
        int number = 4,result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);

        Recursion_In_Java greetings = new Recursion_In_Java();



        Recursive_Marks remarks = new Recursive_Marks();
        remarks.giveRemarks(-10);
    }

}