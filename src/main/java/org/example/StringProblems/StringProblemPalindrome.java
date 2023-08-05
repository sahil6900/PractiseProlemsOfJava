package org.example.StringProblems;

public class StringProblemPalindrome {
    public static void main(String[] args) {
        StringProblemPalindrome s = new StringProblemPalindrome();

        String str = "niin";
        System.out.println(s.palindrome(str));
    }

    public boolean palindrome(String str){

        int i =0;
        int j = str.length()-1;
        while (i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
