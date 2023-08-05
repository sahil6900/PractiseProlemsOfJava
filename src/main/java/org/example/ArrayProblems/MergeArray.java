package org.example.ArrayProblems;

public class MergeArray {

    static int[] arr1 = new int[5];
  static int[] arr2 = new int[7];

  static int[] resultantArray = new int[arr1.length+arr2.length];

    public static int[] merge(int[] arr1,int[] arr2){

        int count = 0;
        for (int i = 0; i < resultantArray.length; i++) {
            if(i<arr1.length){
                resultantArray[i]=arr1[i];
                count++;
            }else if((i-count)< arr2.length){
                resultantArray[i]=arr2[i-count];
            }
        }

        return resultantArray;

    }
}
