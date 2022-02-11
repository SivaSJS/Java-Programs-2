package com.company;

import java.util.Scanner;

public class ConsonentorVowel33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char character = scanner.next().charAt(0);
        switch (character){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("vowels");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
