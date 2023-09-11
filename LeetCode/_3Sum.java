package LeetCode;

import java.util.*;

public class _3Sum {
	
	public static void main (String[] args) {
		int[] nums = {3,-2,0,9,-10,6,-5,-3,-5,-3,9,-3,4,4,-6,-1,8,9,-2,-6,5,-8,6};
		
		System.out.println(threeSum(nums));
	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> ans = new ArrayList();
    	 Set<String> set = new HashSet();
    	 Arrays.sort(nums);
    	 
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = i+1; j < nums.length; j++) {
    			
    			int target = 0 - nums[i] - nums[j];
    			
    			if (binarySearch(target, nums, i, j)) {
    				List<Integer> list = new ArrayList();
    				
    				list.add(nums[i]);
    				list.add(nums[j]);
    				list.add(target);
    				
    				Collections.sort(list);
    				
    				String temp = list.toString();
    				
    				if (!set.contains(temp)) {
    					set.add(temp);
    					ans.add(list);
    				}
    			}
    		}
    	}
    	
    	return ans;
    }
    
    public static boolean binarySearch (int target, int[] nums, int i, int j) {
    	int low = 0;
    	int high = nums.length-1;
    	int mid = 0;
    	
    	while (low <= high) {
    		mid = (low + high)/2;
    		if (target > nums[mid]) {
    			low = mid + 1;
    		} else if (target < nums[mid]) {
    			high = mid - 1;
    		} else {
    			if (mid == i || mid == j) return false;
    			
    			return true;
    		}
    	}
    	
    	return false;
    }
}
