package org.example.ArrayProblems;

public class DiagonalArraySum {

    public static int[] sum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                   sum = sum + arr[i][j];
                }
            }
        }
        return new int[]{sum};
    }

    public static void printUpperTriangle(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j>=i){
                    System.out.print(arr[i][j]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printLowerTriangle(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j<=i){
                    System.out.print(arr[i][j]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
