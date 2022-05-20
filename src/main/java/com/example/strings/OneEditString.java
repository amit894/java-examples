package com.example.strings;


public class OneEditString {

    private static boolean oneEditCheck ( String s, String t){
      if (s.length()>t.length())
          return oneEditCheck(t,s);
      if (t.length()-s.length()>1)
          return false;
      for (int i=0;i<t.length();i++){
          if (t.charAt(i)!=s.charAt(i)){
              if (t.length()==s.length())
                  return (t.substring(i+1).equals(s.substring(i+1)));
              else
                  return (t.substring(i+1).equals(s.substring(i)));
          }
      }
      return (t.length()==s.length()+1);

    }

    public static void main ( String args[]){
        String s ="ab";
        String t ="abc";
        System.out.println(oneEditCheck(s,t));
    }
}
