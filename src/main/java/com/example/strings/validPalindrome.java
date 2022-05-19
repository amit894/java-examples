package com.example.strings;

public class validPalindrome {

    private static boolean isPalindrome(String s, int left,int right){
        boolean flag=false;

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left+=1;
            right-=1;
            flag=true;
        }


        return flag;

    }

    public static boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        boolean flag=false;

        while (left<=right){
            if (s.charAt(left)!=s.charAt(right))
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            flag=true;
            left+=1;
            right-=1;
        }

        return flag;

    }

    public static void main ( String args []){
        System.out.println("Hello");
    }
}
