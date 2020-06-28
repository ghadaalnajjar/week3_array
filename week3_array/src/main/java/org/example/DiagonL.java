package org.example;

public class DiagonL {

    public static void main (String[] args){

        // 12- Write a program which will print the diagonal elements of two-dimensional array:

        int[][] firstarray = new int[3][3];
        firstarray[0][0]= 1;
        firstarray[0][1]= 2;
        firstarray[0][2]= 3;
        firstarray[1][0]= 2;
        firstarray[1][1]= 4;
        firstarray[1][2]= 6;
        firstarray[2][0]= 3;
        firstarray[2][1]= 5;
        firstarray[2][2]= 9;
        display (firstarray);
    }

    public static void display (int a[][]) {
        for (int r=0; r < a.length; r++){
            for (int c=0; c < a[r].length; c++){
                if (r==c) {
                    System.out.print(a[r][c] + " ");
                }
            }
            System.out.print(" ");
        }
    }
}
