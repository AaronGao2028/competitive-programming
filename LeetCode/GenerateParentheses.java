package LeetCode;

import java.util.*;

public class GenerateParentheses {
	static List<String> list;
	
	public static void main (String[] args) {
        System.out.println(generateParenthesis(3));
	}
	
    public static List<String> generateParenthesis(int n) {
    	list = new ArrayList();
    	
    	fun ("(", n-1, n);
    	
    	return list;
    }
    
    public static void fun (String s, int open, int close) {
    	if (open == 0 && close == 0) {
    		list.add(s);
    		
    		return;
    	} else if (open == 0) {
        	fun (s + ")", open, close - 1);
        	
    		return;
    	} 
    	
    	fun (s + "(", open-1, close);
    	
    	if (close > open) {
    		fun (s + ")", open, close-1);
    	}
    }
}
