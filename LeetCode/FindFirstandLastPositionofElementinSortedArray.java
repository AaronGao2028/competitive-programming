package LeetCode;

import java.util.*;

public class FindFirstandLastPositionofElementinSortedArray {
	public static void main (String[] args) {
		int[] nums = {};
		int target = 6;
		
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
    public static int[] searchRange(int[] nums, int target) {        
        int low = binarySearchLowerBound (nums, target);
        int high = binarySearchUpperBound (nums, target);
        
        int[] ans = {low, high};
        
        if (low > high) {
        	ans[0] = -1;
        	ans[1] = -1;
        }
        
        return ans;
    }
    
    public static int binarySearchUpperBound (int[] nums, double target) {
    	int low = 0;
    	int high = nums.length-1;
    	int mid;
    	
    	while (low <= high) {
    		mid = (low + high)/2;
    		
    		
    		if (target >= (double)nums[mid]) {
    			low = mid + 1;
     		} else if (target < (double)nums[mid]) {
     			high = mid - 1;
     		} 
    	}
    	
    	return high;
    }
    
    public static int binarySearchLowerBound (int[] nums, double target) {
    	int low = 0;
    	int high = nums.length-1;
    	int mid;
    	
    	while (low <= high) {
    		mid = (low + high)/2;
    		
    		
    		if (target > (double)nums[mid]) {
    			low = mid + 1;
     		} else if (target <= (double)nums[mid]) {
     			high = mid - 1;
     		} 
    	}
    	
    	return low;
    }
}
