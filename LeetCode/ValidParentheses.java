package LeetCode;

import java.util.*;
import java.io.*;

public class ValidParentheses {
	public static void main (String[] args) {
		System.out.println(isValid("(])"));
	}
	
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
        	char cur = s.charAt(i);
        	
        	if (cur == ')' || cur == ']' || cur == '}') {
        		if (stack.isEmpty()) {
        			return false;
        		}
        		
        		char first = stack.peek();
        		
        		if (first == '(' && cur == ')' || first == '[' && cur == ']' || first == '{' && cur == '}') {
        			stack.pop();
        		} else {
        			stack.push(cur);
        		}
        	
        	} else {
        		stack.push(cur);
        	}
        }
        
        return stack.isEmpty();
    }
}
