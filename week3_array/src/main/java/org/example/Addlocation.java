package org.example;
import java.util.Random;

public class Addlocation {

    public static void main (String[] args){

        //Create two arrays with random numbers, the even numbers (the right side) and the odd numbers(the left side):

        Random random = new Random(); //object of random
        int size = random.nextInt(200); // random number range 0-199
        System.out.println("Size  of array : "+size);
        int[] array1 = new int[size];//obj of array and type of array integer
        int[] array2 = new int[size];
        for(int i = 0; i < size; i++){
            array1[i] = random.nextInt(500);
        }
        int right = size-1, left = 0;
        for (int i = 0; i < size; i++){
            if(array1[i] % 2 == 0){
                array2[right] = array1[i];
                right --;
            }else{
                array2[left] = array1[i];
                left ++;
            }
        }
        for(int i = 0; i<size; i++){
            System.out.print(array2[i] + " ");
        }
    }
}
