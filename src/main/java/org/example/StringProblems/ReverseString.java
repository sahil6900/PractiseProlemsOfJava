package org.example.StringProblems;

public class ReverseString {

    public static void main(String[] args) {
        String str = "sahil is a good boy";
        System.out.println("Original String :- "+ str);
        reverse(str);
    }
    public static void reverse(String str){

        String[] strings = new String[str.length()];

        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result = result + str.charAt(i);
        }

        System.out.println("First reversed :- "+ result);

        String[] split = result.split(" ");
        String reversedString = "";

        for (String s:split) {
            String reverseWord = "";

            for (int i = s.length()-1; i >= 0 ; i--) {
                reverseWord += s.charAt(i);
            }
            reversedString += reverseWord + " ";
        }

        System.out.println(reversedString);

    }
}
