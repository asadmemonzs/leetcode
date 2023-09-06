package com.dsubtwo;

import java.util.ArrayList;

/**
 *
 * @author asadmemonzs
 */
public class Solution {
    ArrayList<String> list = new <String>ArrayList();
    
    int level = 1;
    public int distinctSubseqII(String s) {
        for (int i = 0; i < s.length(); i++) {
            String str = s.charAt(i)+"";
            if(!list.contains(str)){
                list.add(str);
            }
            
        }
        
        int count = 0;
        count = fillArray(s,0);
        
        return count;
    }
    
    public int fillArray(String s, int begin){
        int end = list.size();
        for (int i = begin; i < end; i++) {
            begin++;
            for (int j = 0; j < s.length(); j++) {
                String str = list.get(i) + s.charAt(j);
                if(isSubsequence(str,s) && !list.contains(str)){
                list.add(str);
                }
                
            }
        }
        level++;
        if(level == s.length()) {
            return list.size();
        }
//        int count = fillArray(s,list.size());
        return fillArray(s,begin);
    }
    
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0; 
        
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        
        return sIndex == s.length(); 
    }
}
