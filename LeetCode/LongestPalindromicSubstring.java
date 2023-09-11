package LeetCode;

public class LongestPalindromicSubstring {
	static char[] arr;
	
    public static String longestPalindrome(String s) {
    	String ans = "";
    	int max = 0;
    	arr = s.toCharArray();
    	
    	int left = 0;
    	int right = 1;
    	
    	int oldLeft = 0;
    	int oldRight = 0;
    	
    	while (left < s.length()) {
    		right = left + max;
    		
	    	while (right < s.length()) {
	   			if (isPalindrome (left, right)) {
	   				oldLeft = left;
	   				oldRight = right;
	   				
	   				max = right - left;
	    		}
	    		
	    		right++;
	    	}
    		left++;
    	}
    	
    	for (int i = oldLeft; i <= oldRight; i++) {
    		ans += arr[i];
    	}
    	
    	return ans;
    }
    
    public static boolean isPalindrome (int left, int right) {
    	if (right - left == 0) {
    		return true;
    	} else if (right - left == 1 && arr[right] == arr[left]) {
    		return true;
    	}
    	
    	return arr[left] == arr[right] && isPalindrome(left+1, right-1);
    }
}
