package org.example;

import java.util.Scanner;

public class Index {

    // create a method (indexOf), will find and return the index of an element in the array or not find return -1 :

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[]={2, 10,  5, 2, 4, 6, 7, 3, 8, 9, 20};
        int a = s.nextInt();
        System.out.println("Index position of number " + a +" is: " + indexOf(array,a));
    }
    public static int indexOf(int[] arr, int x){//method or function, the first return take of out.
        for (int i = 0; i<arr.length; i++){
            if( arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
