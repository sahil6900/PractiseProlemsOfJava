package org.example.ArrayProblems;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {2,5,7,1,2,3,7,9,45,10,12};


        System.out.println("--------------------------------------Before--------------------------------------");
        print(arr);

        quickSort(arr,0,arr.length-1);
        System.out.println("--------------------------------------After--------------------------------------");
        print(arr);

    }

    private static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr ,int lowIndex, int highIndex){

        if(lowIndex>=highIndex){
            return;
        }

        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer<rightPointer){
            while (arr[leftPointer]<arr[rightPointer] && leftPointer<rightPointer){
                leftPointer++;
            }
            while ((arr[rightPointer]>=pivot && leftPointer<rightPointer)){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer,highIndex);
        quickSort(arr,lowIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highIndex);
    }

    private static void swap(int[] arr,int index1,int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
}
