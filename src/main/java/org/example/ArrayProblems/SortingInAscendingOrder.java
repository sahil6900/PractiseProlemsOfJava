package org.example.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingInAscendingOrder {

    public static List<Integer> sort(List<Integer> list){
        Integer[] array = list.toArray(new Integer[list.size()]);

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            list1.add(array[i]);
        }
        return list1;
    }
}
