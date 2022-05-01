package com.example.strings;

import java.util.*;

public class GroupAnagrams {

    private static List<List<String>> groupAnagrams (String [] strs){
        if(strs.length==0){
            return new ArrayList();
        }
        HashMap<String,List> ans_map= new HashMap<>();
        for (int i=0; i<strs.length;i++){
            char [] ch_arr= new char[strs[i].length()];
            ch_arr=strs[i].toCharArray();
            Arrays.sort(ch_arr);
            String key = new String(ch_arr);
            if (ans_map.containsKey(key)){
                ans_map.get(key).add(strs[i]);
            }
            else {
                List <String> temp_list = new ArrayList<>();
                temp_list.add(strs[i]);
                ans_map.put(key,temp_list);
            }
        }

        List<List<String>> ans = new ArrayList(ans_map.values());
        return ans;

    }

    public static void main (String args[]){
        System.out.println("hello");
    }
}
