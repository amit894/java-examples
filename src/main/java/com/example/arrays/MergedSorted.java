package com.example.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergedSorted {
    private  static void  merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums1Copy = new int [m];
        for ( int i=0; i<m;i++){
            nums1Copy[i]=nums1[i];
        }
        int i=0;
        int j=0;
        int k=0;

        while (i<nums1Copy.length && j <nums2.length && k<nums1.length){
            if (nums1Copy[i]<nums2[j]){
                nums1[k]=nums1Copy[i];
                i+=1;
                k+=1;
            }
            else {
                nums1[k]=nums2[j];
                j+=1;
                k+=1;

            }
        }

        while (i<nums1Copy.length){
            nums1[k]=nums1Copy[i];
            i+=1;
            k+=1;
        }
        while (j<nums2.length){
            nums1[k]=nums2[j];
            j+=1;
            k+=1;
        }


    }

    public static void main (String args []){
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }

}
