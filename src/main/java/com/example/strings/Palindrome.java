package com.example.strings;

public class Palindrome {

    private static boolean isPalindrome ( String s){
        boolean flag=true;
        int left=0;
        int right=s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                flag=false;
                break;
            }
            left+=1;
            right-=1;
        }

    return flag;
    }
    public static void main (String [] args){
        String s1="abbba";
        System.out.println(isPalindrome(s1));
        String s2="amit";
        System.out.println(isPalindrome(s2));
    }
}
