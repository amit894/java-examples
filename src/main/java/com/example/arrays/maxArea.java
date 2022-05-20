package com.example.arrays;

public class maxArea {

    private static int areaHeights(int [] height){
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while (left<=right){
            maxArea=Math.max(Math.min(height[left],height[right])*(right-left), maxArea);

            if (height[left]<height[right])
                left+=1;
            else
                right-=1;

        }

        return maxArea;

    }

    public static void main ( String args []){
        int [] A = {1,8,6,2,5,4,8,3,7};
        System.out.println(areaHeights(A));
    }
}
