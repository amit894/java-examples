package com.example.strings;

public class Palindrome {

    private static boolean isPalindrome ( String s){
        int i =0;
        boolean flag=true;
        int j=s.length()-1;
        while (i<=j){
            if (s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            i+=1;
            j-=1;
        }
        return flag;

    }
    public static void main (String [] args){
        String s1="abba";
        System.out.println(isPalindrome(s1));
    }
}
