package com.example.arrays;

public class atoi {

    private static int myAtoi(String s) {
       int sign =1;
       int result=0;

       while(s.charAt(0)==' '){
           s=s.substring(1);
       }

       if (s.contains("+-") || s.contains("-+")){
           return 0;
       }

       if (s.charAt(0)=='-'){
           sign=-1;
           s=s.substring(1);
       }

       for ( int i=0;i<s.length();i++){
           if (sign*result<=Integer.MIN_VALUE/10)
               return Integer.MIN_VALUE;
           else if (sign*result>=Integer.MAX_VALUE/10)
               return Integer.MAX_VALUE;
           else if (s.charAt(i)>='0'&& s.charAt(i)<='9'){
               int digit= Integer.valueOf(s.charAt(i))-Integer.valueOf('0');
               result=result*10+digit;
           }
       }

       return sign*result;
    }

    public static void main (String args[]){
        System.out.println(myAtoi("921"));
        System.out.println(myAtoi("-921"));
        System.out.println(myAtoi("-921921921921921921921921921921921921921921921"));
        System.out.println(myAtoi("-+"));
        System.out.println(myAtoi("+-"));


    }
}
