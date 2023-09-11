package LeetCode;

import java.util.Arrays;

public class MaximumSubarray {
	public static void main (String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}
    public static int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = -Integer.MAX_VALUE;
        boolean allNegative = true;
        
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] > 0) {
        		allNegative = false;
        	}
        	if (curSum + nums[i] < 0) {
        		curSum = 0;
        	} else {
        		curSum += nums[i];
        	}
        	
        	maxSum = Math.max(maxSum, curSum);
        }

        if (allNegative) {
        	int ans = -Integer.MAX_VALUE;
        	
        	for (int i = 0; i < nums.length; i++) {
        		ans = Math.max(ans, nums[i]);
        	}
        	
        	return ans;
        }
        return maxSum;
    }
}
