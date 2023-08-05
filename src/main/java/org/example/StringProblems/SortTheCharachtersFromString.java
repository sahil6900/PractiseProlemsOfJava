package org.example.StringProblems;

public class SortTheCharachtersFromString {

    public static void main(String[] args) {
        String str = "sahilpawar";

        sort(str);
    }

    public static void sort(String str){
        char[] array = str.toCharArray();

        char[] chars = new char[str.length()];

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    char temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            chars[i] = array[i];
        }

        removeUplicatesFromSortedString(chars);


    }

    public static void removeUplicatesFromSortedString(char[] c){

        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = i+1; j < c.length; j++) {
                if(c[i]==c[j]){
                    count++;
                    c[j]=(char)-1;
                }
            }
            if(c[i]!=(char)-1 && count>=1){
                System.out.println(c[i]);
            }
        }
    }
}
