package com.example.arrays;

public class atoi {

    private static int myAtoi(String s) {
        int result=0;
        int sign=1;

        if (s.length()==0){
            return 0;
        }

        while(s.charAt(0)==' '){
            s=s.substring(1,s.length());
        }

        if (s.charAt(0)=='-'){
            sign=-1;
            s=s.substring(1,s.length());
        }
        for (int i=0;i<s.length();i++){
            if (result*sign>=(Integer.MAX_VALUE/10)-1){
                return Integer.MAX_VALUE;
            }
            else if (result*sign<=Integer.MIN_VALUE/10){
                return Integer.MIN_VALUE;
            }

            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                int digit=Integer.valueOf(s.charAt(i))-Integer.valueOf('0');
                result=(result*10+digit);
                System.out.println(digit+" "+result);
            }
            else{
                break;
            }

        }

        return result*sign;
    }

    public static void main (String args[]){
        System.out.println(myAtoi("-91283472332"));

    }
}
