package org.example;

public class Factorial {
    static int factorial(int n){
        if (n!=0)
            return n*factorial(n-1);
        else
            return 1;
    }
}
