package org.example;

public class Average {

    // 6- This order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers:

    public static void main(String[] args){
        double[] array1 = {43, 5 , 23 , 17 , 2, 14};
        double sum = 0;
        for (int i = 0; i < array1.length; i++){
        sum = sum + array1 [i];
        }
        double average = sum / array1.length;
        System.out.format(" The average is : %.1f " , average);
    }
}
