package LeetCode;

import java.util.*;

public class GroupAnagrams {
	public static void main (String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(strs));
	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        
        for (int i = 0; i < strs.length; i++) {
        	String original = strs[i];
        	
        	char[] c = strs[i].toCharArray();
        	Arrays.sort(c);
        	String cur = String.valueOf(c);
        	
        	if (!map.containsKey(cur)) {
        		List<String> list = new ArrayList();
        		list.add(original);
        		
        		map.put(cur, list);
        	} else {
        		map.get(cur).add(original);
        	}
        	
        }
        
        List<List<String>> ans = new ArrayList();
        
        for (String key: map.keySet()) {
        	ans.add(map.get(key));
        }
        
        return ans;
    }
}
