package com.example.arrays;


public class BinaryAdd {

    private static String addZeros( String s, int len){
        for (int i=0;i<len;i++){
            s="0"+s;
        }
        return s;
    }

    private static String digitAddition(char digit1, char digit2, char carry){
        if (digit1=='0' && digit2=='0' && carry=='0')
            return "00";
        else if (digit1=='0' && digit2=='0' && carry=='1')
            return "01";
        else if (digit1=='0' && digit2=='1' && carry=='0')
            return "01";
        else if (digit1=='0' && digit2=='1' && carry=='1')
            return "10";
        else if (digit1=='1' && digit2=='0' && carry=='0')
            return "01";
        else if (digit1=='1' && digit2=='0' && carry=='1')
            return "10";
        else if (digit1=='1' && digit2=='1' && carry=='0')
            return "10";
        else if (digit1=='1' && digit2=='1' && carry=='1')
            return "11";

        return null;

    }

    private static String addBinary(String a, String b) {
        if (a.length()>b.length())
            b=addZeros(b,a.length()-b.length());
        else if (b.length()>a.length())
            a=addZeros(b,b.length()-a.length());

        String result=" ";
        char carry='0';

        for ( int i=a.length()-1; i>=0;i--){
            String digit_carry=digitAddition(a.charAt(i),b.charAt(i),carry);
            carry=digit_carry.charAt(0);
            result=String.valueOf(digit_carry.charAt(1))+result;
        }

        if (carry=='1')
            result=String.valueOf(carry)+result;
        return result;


    }

    public static void main (String args[]){
        System.out.println(addBinary("100","101"));
    }
}
