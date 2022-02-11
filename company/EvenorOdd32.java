package com.company;

import java.util.Scanner;

public class EvenorOdd32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("Entered Number is Even");
        }else {
            System.out.println("Entered Number is Odd");
        }
    }
}
