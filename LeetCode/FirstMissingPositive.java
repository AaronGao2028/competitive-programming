package LeetCode;

import java.util.*;

public class FirstMissingPositive {
	public static void main (String[] args) {
		int[] nums = {1};
		
		System.out.println(firstMissingPositive(nums));
	}
	
	//Cycle Sort
    public static int firstMissingPositive(int[] nums) {        
        int index = 0;
        
        while (index < nums.length) {
        	if (nums[index] > 0 && nums[index] <= nums.length) {
	        	int correctPosition = nums[index] - 1;
	        	
	        	if (nums[correctPosition] == nums[index]) {
	        		index++;
	        	} else {
	        		int temp = nums[correctPosition];
	        		nums[correctPosition] = nums[index];
	        		nums[index] = temp;
	        	}
        	} else {
        		index++;
        	}
        }
               
       index = 1;
       
       for (int i = 0; i < nums.length; i++) {
    	   if (nums[i] > 0) {
    		   if (index != nums[i]) {
    			   return index;
    		   } else {
    			   index++;
    		   }
    	   }
       }
       
       return index;
    }
    
    public static void quickSort (int lowIndex, int highIndex, int[] nums) {
    	if (lowIndex >= highIndex) {
    		return;
    	}
    	
    	int pivot = nums[highIndex];
    	
    	int leftPointer = lowIndex;
    	int rightPointer = highIndex;
    	
    	while (leftPointer < rightPointer) {
    		while (nums[leftPointer] <= pivot && leftPointer < rightPointer) {
    			leftPointer++;
    		}
    		
    		while (nums[rightPointer] >= pivot && leftPointer < rightPointer) {
    			rightPointer--;
    		}
    		
    		swap (leftPointer, rightPointer, nums);
    	}
    	
    	swap (leftPointer, highIndex, nums);
    	
    	quickSort (lowIndex, leftPointer-1, nums);
    	quickSort (leftPointer + 1, highIndex, nums);
    }
    
	private static void swap (int index1, int index2, int[] nums) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
