package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class OddNum {

    //Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers:

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 10;
        int array[] = new int[n];
        System.out.println(" Enter the elements in an array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        Arrays.sort(array);
        System.out.print("The odd numbers : ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " " );
            }
        }

    }
}



