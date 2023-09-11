package LeetCode;

public class LongestCommonPrefix {
	public static void main (String[] args) {
		String[] arr = {"ab", "a"};
		
		System.out.println(longestCommonPrefix(arr));
	}
    public static String longestCommonPrefix(String[] strs) {
    	String ans = "";
    	
    	String first = strs[0];
    	boolean same = true;
    	
    	for (int i = 0; i < first.length() && same; i++) {
    		for (int j = 1; j < strs.length; j++) {
    			if (strs[j].length()-1 < i) {
    				same = false;
    			} else {
	    			if (first.charAt(i) != strs[j].charAt(i)) {
	    				same = false;
	    			} 
    			}
    		}
    		
    		if (same) {
    			ans += first.charAt(i);
    		}
    	}
    	
    	return ans;
    }
}
