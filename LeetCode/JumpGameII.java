package LeetCode;

import java.util.Arrays;

public class JumpGameII {
	
	public static void main (String[] args) {
		int[] nums = {2,3,0,1,4};
		

		System.out.println(jump(nums));
	}
	
    public static int jump(int[] nums) {
    	int[] dp = new int[nums.length];
    	Arrays.fill(dp, -1);
    	dp[0] = 0;
    	
    	int max = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		max = Math.max(max, nums[i]);
    	}
    	
    	return fun (nums, nums.length-1, max, dp);
    }
    
    public static int fun (int[] nums, int cur, int max, int[] dp) {
    	if (dp[cur] != -1) {
    		return dp[cur];
    	}
    	
    	int ans = Integer.MAX_VALUE;
    	
    	for (int i = 1; cur - i >= 0 && i <= max; i++) {
    		if (nums[cur-i] >= i) {
    			ans = Math.min(ans, fun(nums, cur-i, max, dp)+1);
    		}
    	}
    	
    	return dp[cur] = ans;
    }
}
