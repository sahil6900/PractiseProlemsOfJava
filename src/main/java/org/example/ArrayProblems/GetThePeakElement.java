package org.example.ArrayProblems;

import java.util.Optional;

public class GetThePeakElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(GetThePeakElement.m1(arr));
    }
    public static int m1(int[] arr){
        int N = 2;

        int left =0;
        int right = arr.length-1;

        while (left<right){
            int mid = left + (right-left)/2;

            if(arr[mid]==N){
                return arr[mid-1];
            }else if(arr[mid]<N){
                return left = N-arr[mid] +1;
            }else {
                return right = arr[mid] -1;
            }
        }
        return 0;
    }
}
