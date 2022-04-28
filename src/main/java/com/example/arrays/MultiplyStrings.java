package com.example.arrays;

public class MultiplyStrings {

    private static long sequenceMutiply(String num1, String num2){
        long result=0;
        long int_num1=Long.valueOf(num1);
        for (int i=num2.length()-1; i>=0;i--){
            long digit = Integer.valueOf(num2.charAt(i)) -Integer.valueOf('0');
            long x= (int)Math.pow(Float.valueOf(10),Float.valueOf(num2.length()-i-1));
            long digit_mutiply=(int_num1*digit)*x;
            System.out.println(digit_mutiply);
            result=result+digit_mutiply;

        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(sequenceMutiply("123456789","987654321"));

    }
}
