package LeetCode;

import java.util.*;

public class LetterCombinationsofaPhoneNumber {
	static HashMap<Character, List<String>> map = new HashMap();
	static List<String> ans;
	
	public static void main (String[] args) {
		letterCombinations("");
		
		System.out.println(ans);
	}
	public static List<String> letterCombinations(String digits) {
		List<String> list = Arrays.asList(new String[]{"a", "b", "c"});
        map.put('2', list);
        
        ans = new ArrayList();
        
        if (digits.length() == 0) {
        	return ans;
        }
        
        list = Arrays.asList(new String[]{"d", "e", "f"});
        map.put('3', list);
        
        list = Arrays.asList(new String[]{"g", "h", "i"});
        map.put('4', list);
        
        list = Arrays.asList(new String[]{"j", "k", "l"});
        map.put('5', list);
        
        list = Arrays.asList(new String[]{"m", "n", "o"});
        map.put('6', list);
        
        list = Arrays.asList(new String[]{"p", "q", "r", "s"});
        map.put('7', list);
        
        list = Arrays.asList(new String[]{"t", "u", "v"});
        map.put('8', list);
    
        list = Arrays.asList(new String[]{"w", "x", "y", "z"});
        map.put('9', list);
        
        fun (digits, "");
        
        return ans;
    }
	
	public static void fun(String digits, String s) {
		if (digits.length() == 0) {
			ans.add(s);
			return;
		}
		
		List<String> list = map.get(digits.charAt(0));
		
		for (int i = 0; i < list.size(); i++) {
			String temp = s + list.get(i);
			fun (digits.substring(1), temp);
		}
	}
}	
