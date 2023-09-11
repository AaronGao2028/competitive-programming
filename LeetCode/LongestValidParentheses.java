package LeetCode;

import java.util.*;

public class LongestValidParentheses {
	public static void main (String[] args) {
		System.out.println(longestValidParentheses ("()()()(()))())"));
		
	}
    public static int longestValidParentheses(String s) {
    	char[] a = s.toCharArray();
    	int ans = 0;
    	
    	Stack <CharPair> stack = new Stack();
    	boolean[] b = new boolean[a.length];
    	
    	for (int i = 0; i < a.length; i++) {
    		if (!stack.isEmpty() && a[i] == ')' && stack.peek().c == '(') {    			
    			b[i] = true;
    			b[stack.peek().n] = true;
    			
    			stack.pop();
    		} else {
    			stack.add(new CharPair (a[i], i));
    		}
    	}
    	
    	int counter = 0;
    	
    	for (int i = 0; i < b.length; i++) {
    		if (!b[i]) {
    			counter = 0;
    		} else {
    			counter++;
    		}
    		
    		ans = Math.max(ans, counter);
    	}
    	return ans;
    }
    
    public static class CharPair {
    	char c;
    	int n;
    	
    	public CharPair (char c, int n) {
    		this.c = c;
    		this.n = n;
    	}
    	
    	public String toString () {
    		return c + " " + n;
    	}
    }
}

