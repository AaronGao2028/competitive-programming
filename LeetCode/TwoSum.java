package LeetCode;

import java.util.*;

public class TwoSum {
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(twoSum(arr, 5)));
	}
    public static int[] twoSum(int[] nums, int target) {
    	int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
        	for (int j = 0; j < nums.length && j != i; j++) {
        		if (target - nums[i] == nums[j]) {
        			ans[0] = i;
        			ans[1] = j;
        		}
        	}
        }
        
        return ans;
    }
}
