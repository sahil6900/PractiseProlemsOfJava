package org.example.ArrayProblems;

import java.util.Map;

public class FindMinimumNumberFromAnArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,9,4};
        FindMinimumNumberFromAnArray.min(arr);
        //FindMinimumNumberFromAnArray.minUsingAnotherMethod(arr);
    }

    public static void min(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[0]);
        }
    }

    public static void minUsingAnotherMethod(int[] arr){
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res,arr[i]);
        }
        System.out.println(res);
    }
}
