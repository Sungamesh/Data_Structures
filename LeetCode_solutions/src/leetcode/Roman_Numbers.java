package leetcode;

import java.util.*;

//Roman to Integer O(n)
class Solution {
    public int romanToInt(String s) {
        
        if(s.length() > 15 && s.length() < 1)
            return -1;
        
        int result = 0;
        
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("I",1);
        m.put("IV",4);
        m.put("V",5);
        m.put("IX",9);
        m.put("X",10);
        m.put("XL",40);
        m.put("L",50);
        m.put("XC",90);
        m.put("C",100);
        m.put("CD",400);
        m.put("D",500);
        m.put("CM",900);
        m.put("M",1000);
        
        for(int i=0; i<s.length(); i++){
            
            String temp1 = null;
            
            if (i != s.length()-1) {
            	temp1 = ""+s.charAt(i)+s.charAt(i+1);
            }
            
            String temp2 = ""+s.charAt(i);
            
            if(i != s.length()-1 && m.containsKey(temp1)) {
                result += m.get(temp1);
            	i += 1;
            } else if(m.containsKey(temp2))
                result += m.get(temp2);
            
        }
        
        return result;
    }
}

public class Roman_Numbers {

	public static void main(String... args) {
		
		Solution sol = new Solution();
		
		int num = sol.romanToInt("MCMXCIV");
		
		System.out.println(num);
	}
	
	
}
