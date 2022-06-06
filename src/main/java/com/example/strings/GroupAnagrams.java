package com.example.strings;

import java.util.*;

public class GroupAnagrams {

    private static List<List<String>> groupAnagrams (String [] strs){
      if (strs.length==0)
          return null;
      Map <String,List> map = new HashMap <>();
      for ( int i=0; i< strs.length;i++){
          char [] char_array = strs[i].toCharArray();
          Arrays.sort(char_array);
          String sorted_str= new String(char_array);

          if (map.containsKey(sorted_str))
              map.get(sorted_str).add(strs[i]);
          else {
              List <String> temp_list = new ArrayList<>();
              temp_list.add(strs[i]);
              map.put(sorted_str,temp_list);
          }

      }
        List <List<String>> result = new ArrayList(map.values());
        return result;


    }

    public static void main (String args[]){
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
