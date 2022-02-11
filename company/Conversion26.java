package com.company;

import java.util.Scanner;

public class Conversion26 {

    public static void main(String[] args) {
        //26 conversion Programs LIke KM to miles,centigrade to fahrenheit & sqft to acre etc

        //    Kilometer to miles

        // 1miles = 1.609344km => 1km = 1miles/1.609344
        double conversionFactor = 1.609344;

        System.out.print("Enter the distance in km: ");
        Scanner scanner = new Scanner(System.in);
        double kilometre = scanner.nextDouble();

        double miles = kilometre / conversionFactor;

        System.out.println("the distance in miles is " + miles);

             //  centigrade to fahrenheit

            System.out.print("Enter the temperature in degree centigrade:  ");
           double celsius = scanner.nextDouble();
           double  farenheit = (celsius * 1.8) + 32;
           System.out.print("The temperature in farenheit is: " + farenheit);

             //          sqft to acre
        {
            System.out.print("Enter the sqft: ");
         double sqft=scanner.nextDouble();
         double acre=sqft/43560;

            System.out.println("The acre is " + acre);
        }
    }
}