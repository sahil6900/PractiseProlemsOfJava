package org.example.StringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurenceInString {
    public static void main(String[] args) {
        String str = "ssaaaahilll";
        getDuplicatesFromString(str);
    }

    public static Map<String,Integer> countCharacters(String str){
        String[] split = str.split("");
        System.out.println(Arrays.toString(split));
        Map<String,Integer> map = new HashMap<>();

        for (String s: split) {
            Integer count = map.get(s);
            if(count == null){
                map.put(s,1);
            }else {
                map.put(s,count+1);
            }
        }
        return map;
    }

    public static void getDuplicatesFromString(String str){
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            for (int j = i+1; j < charArray.length; j++) {
                if(charArray[i]==charArray[j]){
                    count++;
                    charArray[j]=(char)-1;
                }
            }
            if(charArray[i]!=(char)-1 && count>=1){
                System.out.println(charArray[i]+"-"+count);
            }
        }
    }

}
