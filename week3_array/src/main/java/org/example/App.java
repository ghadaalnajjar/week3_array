package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner s = new Scanner(System.in);
        int n = 10;
        int array[] = new int[n];
        System.out.println(" Enter the elements  array: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        // 4- Copy the elements of one array in to another array:

        System.out.println("Elements from second array (the same number in first array : )");
        int array2[] = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = array[i];
            System.out.print(array[i] + "\t");
        }

        // Will store elements in an array:

        System.out.println();
        System.out.println("The store elements: ");
        Arrays.sort(array);
        int arrays[] = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = array[i];
            System.out.print(array[i] + "\t");
        }

        // 3- Write a program which will sort string array. String array: [Paris, London, New York, Stockholm]

        System.out.println(" ");
        String[] city = {" Paris ", " London ", " NewYork", " Stockholm "};
        Arrays.sort(city);
        System.out.print("The sort string array :" + "\t");
        for (String c : city) {
            System.out.print(c);
        }
    }
}
