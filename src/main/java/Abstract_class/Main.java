/* you cannot create an object of an abstract class
*  an abstract class can have all of its methods not being abstract but an abstract method should always have an abstract class.
*  Since you cannot always create an instance on an abstract class , you can decide to create a subclass of the abstract class then use this subclass
*  to create an object.
*  If you are having an abstract method and you create a subclass you must include the method to implement the abstract method hence you have to
*  also make that class abstract as well*/
package Abstract_class;

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music");
    }
}
abstract class wagonR extends  Car{

    public void fly(){
        System.out.println("Flying");
    }
}

class updatedWagonR extends wagonR{
    public void drive(){
        System.out.println("Driving");
    }
}
public class Main {
    public static void main(String[] args){
        Car obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

}
