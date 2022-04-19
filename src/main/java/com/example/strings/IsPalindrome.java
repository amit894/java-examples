package com.example.strings;

public class IsPalindrome {

    private static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        boolean flag=false;
        while (left<=right){
            if (s.charAt(left)<'a' || s.charAt(left)>'z'){
                left+=1;
            }
            else if (s.charAt(right)<'a' || s.charAt(right)>'z'){
                right-=1;
            }
            else if (s.charAt(right)!=s.charAt(left)){
                return false;
            }
            else {
                left+=1;
                right-=1;
                flag=true;
            }


        }
        return flag;
    }

    public static void main (String args[]){
        System.out.println(isPalindrome("race a car"));

    }
}
