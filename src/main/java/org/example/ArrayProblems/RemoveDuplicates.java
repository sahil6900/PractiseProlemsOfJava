package org.example.ArrayProblems;

import java.util.*;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(int[] arr) {

        int[] resultantArray = MergeArray.resultantArray;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < resultantArray.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < resultantArray.length; j++) {
                if (resultantArray[i] == resultantArray[j]) {
                    resultantArray[j] = -1;
                    counter++;
                }
            }
            if (resultantArray[i] != -1 && counter <= 1) {
                list.add(resultantArray[i]);
            }
        }
        return list;
    }
}
