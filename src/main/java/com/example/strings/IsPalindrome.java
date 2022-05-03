package com.example.strings;

import java.util.Locale;

public class IsPalindrome {

    private static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        boolean flag = false;

        while (left<=right){
            if (!((s.charAt(left)>='a' && s.charAt(left)<='z') || (s.charAt(left)>='0' && s.charAt(left)<='9'))){
                left+=1;
                flag=true;
            }
            else if (!((s.charAt(right)>='a' && s.charAt(right)<='z') || (s.charAt(right)>='0' && s.charAt(right)<='9'))){
                right-=1;
                flag=true;
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
        System.out.println(isPalindrome("rac a car"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(" "));


    }
}
