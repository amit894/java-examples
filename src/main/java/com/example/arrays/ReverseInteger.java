package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int x){
        int sign =0;
        int result=0;
        if (x>0){
            sign=1;
        }
        else {
            sign=-1;
        }

        while (x!=0){
            if (sign*result<Integer.MIN_VALUE/10){
                return 0;

            }
            else if (sign*result>Integer.MAX_VALUE/10){
                return 0;
            }
            int digit=x%10;
            result=result*10+digit;
            x=x/10;
        }

        return result;

    }

    public static void main (String args []){
        int a =-12305;
        System.out.println(reverse_int(a));
    }
}
