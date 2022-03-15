package com.example.arrays;

import java.util.Arrays;

public class LeftRotateOptimizied {

    public static void main (String args[]){
        int A[]={1,2,3,4,5};
        left_optimizied(A,2);
        System.out.println(Arrays.toString(A));
    }

  private static int gcd(int a, int b)
  {
      if(a==0){
          return b;
      }
      else if (b==0){
          return a;
      }
      else {
          return gcd(b, a%b);
      }
  }

  private static void left_optimizied(int []A, int d){
        d=d%A.length;
        int g_c_d=gcd(d,A.length);
        for (int i=0; i<g_c_d; i++){
            int j=i;
            int temp=A[i];
            while (true){
                int k=d+j;
                if (k>=A.length){
                    k=k-A.length;
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