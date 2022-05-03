package com.example.arrays;
import java.util.*;

public class LongestSubstring {


    private static int LengthofLongestSubstring( String s){
      String subs ="";
      int maxLength=0;
      for (int i=0; i<s.length();i++){
          if (subs.contains(String.valueOf(s.charAt(i)))){
              subs=subs.substring(subs.indexOf(s.charAt(i))+1,subs.length());
          }
          subs+=String.valueOf(s.charAt(i));
          maxLength=Math.max(maxLength,subs.length());
      }

      return maxLength;
    }

    public static void main (String [] args){
        System.out.println(LengthofLongestSubstring("pwwkew"));

    }
}
