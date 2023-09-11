package LeetCode;

import java.util.*;

public class RomantoInteger {
	public static void main (String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
    public static int romanToInt(String s) {
        char[] c = s.toCharArray();
        
        Map<String, Integer> map = new HashMap();
        
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        int sum = 0;
        
        for (int i = 0; i < c.length; i++) {
        	if (i < c.length-1) {
        		if (map.get(""+c[i]) < map.get(""+c[i+1])) {
        			sum -= map.get(""+c[i]);
        		} else {
        			sum += map.get(""+c[i]);
        		}
        	} else {
        		sum += map.get(""+c[i]);
        	}
        }
        
        return sum;
    }
}
