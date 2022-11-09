package Week5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    public static Scanner input = new Scanner(System.in);
    private int[] arr;

    public MyArray() {
    }

    public MyArray(int size) {
        this.arr = new int[size];
    }

    public void enterArray(){

        for(int i = 0; i < arr.length; i++){
            System.out.print("Array " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    public void enterArrayRandom(){
        Random  rd = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Creat done!");
    }

    public void displayArray(){
        System.out.println("Display Array");
        for (int i  = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public void sortArray(){
        System.out.println("Sorting");
        Arrays.sort(arr);
        displayArray();
    }

    public int calSum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
}
