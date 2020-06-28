package org.example;

public class Countrycity {

    // 5- Create a two-dimensional string array [2][2], array containing any Country and City:

    public static void main (String[] args){
        String firstarray[][] = new String[2][2];
        firstarray[0][0]="France";
        firstarray[0][1]="Paris";
        firstarray[1][0]="Sweden";
        firstarray[1][1]="Stockholm";
        display (firstarray);
    }

    public static void display (String a[][]) {
        for (int r=0; r < a.length; r++  ){
            for (int c=0; c < a[r].length; c++){
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}
