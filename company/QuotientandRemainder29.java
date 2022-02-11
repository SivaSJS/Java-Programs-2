package com.company;

import java.util.Scanner;

public class QuotientandRemainder29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1stinput: ");
        int input = scanner.nextInt();
        System.out.print("Enter the secondInput: ");
        byte input2 = scanner.nextByte();
        System.out.println("The quotient is "+ input/input2 +  " and the remainder is " + input%input2);



    }
}
