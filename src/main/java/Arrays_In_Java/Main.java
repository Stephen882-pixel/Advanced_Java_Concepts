/* An array is used to store multiple data of the same data types into a single variable unlike the variable
*  which just stores one value into a single variable
*  types of arrays we have One-dimensional array (is also known as linear array where the elements are stored in a single row)
*  we also have a two dimensional array (stores data in rows and columns)
*  we also have the multi-dimensional array which is a combination of two or more arrays or nested arrays*/


package Arrays_In_Java;

public class Main {
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0;i<arr.length;i++){
            System.out.println("Element at index " +i+ " is " + arr[i]);
        }

        // one - dimensional array
        int arr1[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println("Sum of array is: " + sum);

        // two-dimensional array
        int arr2 [][] = {{1,2,3},{4,5,6}};
        for (int i=0;i<2;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Above that was two-dimension array");
        // multi-dimensional array
        int arr3 [][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
