package org.example.ArrayProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GettingSecondHighestElementFromList {

   static List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,4,6);

    public static void main(String[] args) {
       GettingSecondHighestElementFromList.get(list);
    }


    public static void get(List<Integer> list){
        Optional<Integer> integer = list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).findFirst();

        Optional<Integer> integer1 = Optional.ofNullable(integer.get());

        integer1.ifPresentOrElse(n-> System.out.println(n),()-> System.out.println("no value"));


    }
}
