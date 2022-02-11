package com.company;
import java.util.Scanner;

public class SwapTwoNumbers31 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x= scanner.nextInt();
        System.out.print("Enter the value of y: ");
       int  y= scanner.nextInt();

       int z= x;
        x=y;
        y=z;
        System.out.println("After swapping, the numbers of x = " + x + " and y = " + y );
    }


}
