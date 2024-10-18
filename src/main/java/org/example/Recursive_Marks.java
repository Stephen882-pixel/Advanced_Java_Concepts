package org.example;

public class Recursive_Marks {
    public static void giveRemarks(int marks){
        System.out.println(" You have passed your exam ");
        if( marks >= 1 ){
            return;
        }
        giveRemarks(marks + 1);
    }
}
