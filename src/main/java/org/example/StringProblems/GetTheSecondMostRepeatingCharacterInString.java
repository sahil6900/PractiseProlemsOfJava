package org.example.StringProblems;

import java.util.*;
import java.util.stream.Collectors;

public class GetTheSecondMostRepeatingCharacterInString {

    public static List<Map.Entry<String, Integer>> getSecondMostChar(String str){
        String[] string = str.split("");

        Map<String,Integer> map = new HashMap<>();

        for (String s : string) {
            if(map.get(s)==null){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }



        List<Map.Entry<String, Integer>> collect = map.entrySet().stream().filter(entry -> entry.getValue() > 1).skip(0).limit(1).collect(Collectors.toList());
        return collect;
    }
}
