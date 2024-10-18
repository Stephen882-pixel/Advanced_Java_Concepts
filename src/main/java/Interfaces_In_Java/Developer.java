package Interfaces_In_Java;

interface Computer{
    public abstract void code();
}



class Desktop implements Computer{
    public void code(){
        System.out.println(" Code, Compile, Run :Faster");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println(" Code, Compile, Run ");
    }
}


public class Developer {
   public void devApp(Computer lap){
       lap.code();
   }
}


