package com.example.strings;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Locale;

public class Palindrome {

    private static boolean isPalindrome ( String s){
      s=s.toLowerCase();
      boolean flag=true;
      int left=0;
      int right=s.length()-1;

      while (left<=right){
          if (s.charAt(left)!=s.charAt(right))
              return false;
          left+=1;
          right-=1;
          flag=true;
      }

      return flag;

    }
    public static void main (String [] args){
        String s1="Abbba";
        System.out.println(isPalindrome(s1));
        String s2="amit";
        System.out.println(isPalindrome(s2));
    }
}
