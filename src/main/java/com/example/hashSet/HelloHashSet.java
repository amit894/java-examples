package com.example.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HelloHashSet {

    public static void main ( String [] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        System.out.println(set);
        for (int ele:set) {
            System.out.println(ele);
        }

    }
}
