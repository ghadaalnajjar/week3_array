package org.example;

public class Multiplication {

    //10- Write a program which will represent multiplication table stored in multidimensional array:
    // [1,2,3,4,5,6,7,8,9,10],[1,2,3,4,5,6,7,8,9,10]]

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t ");
            }
            System.out.println();
        }
    }
}
