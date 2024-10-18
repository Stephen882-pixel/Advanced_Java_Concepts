// Dynamic method dispatch
/* Polymorphism is an important concept in Object oriented programming and it simply means more than one form.
*  This means that the same entity( method or operator or object ) can perform different operations in different scenarios*/

package polymorphism_in_java;

class A{
    public void show(){
        System.out.println(" in A show ");
    }

}
class B extends  A{
    public void show(){
        System.out.println(" in B show ");
    }
}

class C extends  A{
    public void show(){
        System.out.println(" in C show ");
    }
}


public class Main {
    public static void main(String[] args){
        A obj = new B();
        obj.show();
        obj = new A();
        obj.show();
        obj = new C();
        obj.show();

    }
}
