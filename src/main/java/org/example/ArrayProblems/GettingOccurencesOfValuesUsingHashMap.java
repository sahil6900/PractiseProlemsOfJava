package org.example.ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class GettingOccurencesOfValuesUsingHashMap {

    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,6,7,4,5,3,21,1};
        GettingOccurencesOfValuesUsingHashMap.m1(arr);
    }

    static Map<Integer , Integer> map = new HashMap<>();
    public static void m1(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
    }
}
