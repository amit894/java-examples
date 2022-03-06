package com.example.arrays;

import java.util.Arrays;

public class LeftRotateOptimizied {

    public static void main (String args[]){
        int A[]={1,2,3,4,5};
        left_optimizied(A,2,5);
        System.out.println(Arrays.toString(A));
    }

    private static int gcd (int num1, int num2){
        if (num1==0){
            return num2;
        }
        if (num2==0){
            return num1;
        }
        else {
            return gcd(num2,num1%num2);
        }
    }

    private static void left_optimizied(int A[], int d , int n){
        d=d%n;
        int g_c_d=gcd(1,5);
        for (int i =0; i<g_c_d;i++){
            int j =i;
            int temp=A[i];
            while(true) {
                int k = j+d;
                if (k>=n) {
                    k=k-n;
                }
                if (k==i){
                    break;
                }
                A[j]=A[k];
                j=k;

            }
            A[j]=temp;
        }
    }
}

//Time Complexity : O(n)
// Auxililary Space Complexity: O(1)