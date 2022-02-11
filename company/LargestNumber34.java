package com.company;

public class LargestNumber34 {
    public static void main(String[] args) {
        int arr[] = {1,2,5};
        int val[] = {0};
        for (int i = 0; i < arr.length; i++){
                 if(arr[i] >= val[0]){
                     val[0] = arr[i];
                 }
            }
        System.out.println("Largest Number among 3 numbers are " + val[val.length-1]);


    }
}
