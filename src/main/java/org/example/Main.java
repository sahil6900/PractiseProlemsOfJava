package org.example;

import org.example.ArrayProblems.DiagonalArraySum;
import org.example.ArrayProblems.MergeArray;
import org.example.ArrayProblems.RemoveDuplicates;
import org.example.ArrayProblems.SortingInAscendingOrder;
import org.example.StringProblems.CharacterOccurenceInString;
import org.example.StringProblems.GetTheSecondMostRepeatingCharacterInString;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        int[] arr1 = {1,6,3,7,8};
//        int[] arr2 = {5,3,2,7,8,9,4};

//        System.out.println("Merging Two Arrays : "+Arrays.toString(MergeArray.merge(arr1,arr2)));
//
//        System.out.println("Removing the Duplicates from merged Array : "+RemoveDuplicates.removeDuplicates(MergeArray.merge(arr1,arr2)));
//
//        System.out.println("Sorting the Array after removing the duplicates : "+SortingInAscendingOrder.sort(RemoveDuplicates.removeDuplicates(MergeArray.merge(arr1,arr2))));

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}};

        // System.out.println(Arrays.toString(DiagonalArraySum.sum(arr)));
        //DiagonalArraySum.printUpperTriangle(arr);
        //DiagonalArraySum.printLowerTriangle(arr);

        //System.out.println(CharacterOccurenceInString.countCharacters("sahilll"));

        //System.out.println(GetTheSecondMostRepeatingCharacterInString.getSecondMostChar("fhdfhlasljfklgds"));
        List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,4,5,6,5,4,3,6,7,8,9,10);

        Integer integer = list.stream().filter(c -> Collections.frequency(list, c) > 1).skip(0).findFirst().get();
        System.out.println(integer);
    }
}