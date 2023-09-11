package LeetCode;

import java.util.Arrays;

public class JumpGame {
	public static void main (String[] args) {
		int[] nums = {3,2,1,0,4};
		System.out.println(canJump(nums));
		
	}
    public static boolean canJump(int[] nums) {
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	if (i <= max)
        	max = Math.max(max, i + nums[i]);
        }
        
        if (max >= nums.length-1) {
        	return true;
        } else {
        	return false;
        }
    }
}
