package com.example.strings;

public class validPalindrome {

    private static boolean isPalindrome(String s, int left,int right){
       while (left<=right){
           if (s.charAt(left)!=s.charAt(right))
               return false;
           left+=1;
           right-=1;
       }
       return true;
    }

    public static boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while (left<=right){
            if (s.charAt(left)!=s.charAt(right))
                return (isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1));
        }
        return true;



    }

    public static void main ( String args []){
        System.out.println("Hello");
    }
}
