/* The parent exceptions should always come last */

package Java_Excepttion;

class Area{
    int l;
    int w;
    int area;

    public void getArea(int l,int w){
        area = l/w;
       System.out.println("The area is : " + area);
   }


}

public class Main {
    public static void main(String[] args){
        int i = 20;
        int j = 0;
        int[] arr = new int[8];
        String str = null;

        try
        {
            j = 18/i;
//            System.out.println(str.length());
//            System.out.println(arr[8]);

        }
        catch (ArithmeticException e){
            System.out.println("Something went wrong " + e);
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Stay in your limit");
//        }
        catch (Exception e){
            System.out.println("Something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Hello there");
        Area obj = new Area();
        try
        {
            obj.getArea(30,10);
        }
        catch (Exception e){
            System.out.println("Something probably went wrong.Please check your dimensions " +  e);
        }



    }
}
