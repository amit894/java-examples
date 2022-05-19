package com.example.strings;

import java.util.Locale;

public class IsPalindrome {

    private static boolean isPalindrome(String s) {
        boolean flag=false;
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;


        if (s.isEmpty())
            return true;


        while (left<=right){
            if (!(Character.isAlphabetic(s.charAt(left)) || Character.isDigit(s.charAt(left)))) {
                left += 1;
                flag = true;
            }
            else if (!(Character.isAlphabetic(s.charAt(right)) || Character.isDigit(s.charAt(right)))){
                right -= 1;
                flag = true;
            }
            else if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            else{
                flag=true;
                left+=1;
                right-=1;

            }

        }
        return flag;
    }



    public static void main (String args[]){
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome("1b1"));

//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//          System.out.println(isPalindrome("race a car"));
//          System.out.println(isPalindrome("rac a car"));
//          System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//          System.out.println(isPalindrome(" "));


    }
}
