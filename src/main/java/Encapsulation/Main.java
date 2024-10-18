// Encapsulation refers to the bundling of fields and methods inside a single class
package Encapsulation;

class Human{
    private int age = 22;
    private String name = "Stephen";

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args){
        Human obj = new Human();
//        obj.age = 20;
//        obj.name = "Stephen";
//        System.out.println(obj.age);
//        System.out.println(obj.name);
//        System.out.println(obj.getAge());
//        System.out.println(obj.getName());
        obj.setAge(22);
        obj.setName("Stephen");
        System.out.println("The age is :" + obj.getAge());
        System.out.println(" The name is : " + obj.getName());

    }
}
