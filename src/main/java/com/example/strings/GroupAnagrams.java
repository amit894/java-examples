package com.example.strings;

import java.util.*;

public class GroupAnagrams {

    private static List<List<String>> groupAnagrams (String [] strs){
      if (strs.length==0){
          return null;
      }

      HashMap<String,List> map = new HashMap<>();
      for (int i=0; i<strs.length; i++){
          char [] temp_char_array = new char[strs[i].length()];
          temp_char_array = strs[i].toCharArray();
          Arrays.sort(temp_char_array);
          String sort_string = new String(temp_char_array);

          if (map.containsKey(sort_string)){
              map.get(sort_string).add(strs[i]);
          }
          else{
              List <String> temp_list = new ArrayList<>();
              temp_list.add(strs[i]);
              map.put(sort_string,temp_list);
          }
      }

      List<List<String>> res = new ArrayList(map.values());
      return res;

    }

    public static void main (String args[]){
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
