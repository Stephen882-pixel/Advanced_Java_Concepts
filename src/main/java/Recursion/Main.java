package Recursion;

// Remarks example
class Remarks{
    public void getRemarks(int marks){
        if(marks >= 20){
            System.out.println("You have enough marks");
            return; // Base case:stops the recursion when the marks are 20 or more;
        }
        int marksNeeded = 20 - marks; //calculate how may more marks are needed
        System.out.println("Work hard!You neeed at least " + marksNeeded + " more marks to reach 20 ");
        getRemarks(marks + 2);  // Recursive call with marks increased by 2
    }
}

class numbers{
    public void printNumbers(int num){
        if(num == 0){  // Base class
            return;
        }
        System.out.println(num);
        printNumbers(num - 1);
    }
}

// Cats example
class Cats{
    public void No_of_Cats(int number){
        if (number == 0){
            return;
        }
        int no_of_eyes = number * 2;
        System.out.println( number + " cats " + no_of_eyes + " number of eyes ");
    }
}


class Power{
    double base;
    double exponent;
    double result;
    public void getPower(double base,double exponent){
        result = Math.pow(base,exponent);
        if(result > 2147483647){  // this is the base case
            System.out.println("The number is too large");
        }
        System.out.println(result); // this is the recursive call
    }
}


// Factorial example
class Factorial{
    static int getFactorial(int n){
        if(n!=0){
            return n * getFactorial(n-1);
        } else
            return 1;
    }
}

public class Main {
    public static void main(String[] args){
        // Remarks example
        Remarks obj = new Remarks();
//        obj.getRemarks(4);

        // Numbers example
//        numbers obj1 = new numbers();
//        obj1.printNumbers(5);

        // Cats example
        Cats obj2 = new Cats();
        obj2.No_of_Cats(7);

        // Power example
        Power obj3 = new Power();
        obj3.getPower(2,4);

        // Factorial example
        Factorial obj5 = new Factorial();
        int number = 24,result;
        result = (number);
        System.out.println(result);
    }
}

