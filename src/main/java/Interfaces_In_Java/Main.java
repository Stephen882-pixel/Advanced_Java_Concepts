/* An interface in java is a fully abstract class.
*   All methods declared inside an interface are by default public abstract.
*   All methods declared inside an interface have no implementations.
*   In order to implement these methods you have to create a class then use the keyword implements followed by the name of the interface.
*   You have also to do the implementations of the methods inside the created class otherwise you will receive an error.
*   And when you now want to create the instance of the class to come up with an object you have to referene the class and not the interface(and just heads up the clas should not happen to be an abstract class).
*   If suppose you define variables inside the interface then they will automatically assume the final and static state.
*   To print out or execute the method you call it with the Interface and not the object */

package Interfaces_In_Java;

interface A{


    void show();
    void config();

    int age = 45;
    String city = "Nairobi";   // these two variables are static and final
}

class B implements A{


    public void show() {
        System.out.println(" in show ");
    }

    public void config() {
        System.out.println(" in config ");
    }
}

public class Main {
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();



        System.out.println(A.city);


        Developer Stephen = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Stephen.devApp(lap);

    }
}
