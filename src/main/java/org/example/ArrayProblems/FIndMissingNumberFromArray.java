package org.example.ArrayProblems;

public class FIndMissingNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,9};

        findMissingNumber(arr);
    }

    public static void findMissingNumber(int[] arr){
        int i=0,j=0,temp=0;

        while(i<arr.length){
            if(arr[i]==j){
                i++;
                j++;
            }else{
                temp = j;
                j++;
                System.out.println(temp);
            }
        }

    }
}
