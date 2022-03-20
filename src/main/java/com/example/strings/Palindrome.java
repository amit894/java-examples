package com.example.strings;

public class Palindrome {

    private static boolean isPalindrome ( String s){
    boolean flag=true;
    int i=0;
    int j=s.length()-1;

    while (i<=j){
        if (s.charAt(i)!=s.charAt(j)){
            flag=false;
            return flag;
        }
        i+=1;
        j-=1;
    }

    return flag;
    }
    public static void main (String [] args){
        String s1="abbba";
        System.out.println(isPalindrome(s1));
    }
}
