package com.example.strings;


public class OneEditString {

    private static boolean oneEditCheck ( String s, String t){
        if (s.length()>t.length())
            return oneEditCheck(t, s);
        if (t.length()-s.length()>1)
            return false;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)!=t.charAt(i)){
                if (s.length()==t.length())
                    return s.substring(i+1).equals(t.substring(i+1));
                else
                    return s.substring(i).equals(t.substring(i+1));
            }
        }
        return ((s.length()+1)==t.length());

    }

    public static void main ( String args[]){
        String s ="ab";
        String t ="abc";
        System.out.println(oneEditCheck(s,t));
    }
}
