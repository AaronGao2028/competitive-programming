package LeetCode;

import java.util.Arrays;

public class TrappingRainWater {
	public static void main (String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trap (height));
	}
    public static int trap(int[] height) {
    	int ans = 0;
    	int[] leftMax = new int[height.length];
    	int[] rightMax = new int[height.length];
    	
    	leftMax[0] = height[0];
    	
    	for (int i = 1; i < height.length; i++) {
    		leftMax[i] = Math.max(leftMax[i-1], height[i]);
    	}
    	
    	rightMax[height.length-1] = height[height.length-1];
    	
    	for (int i = height.length-2; i >= 0; i--) {
    		rightMax[i] = Math.max(rightMax[i+1], height[i]);
    	}
        
    	for (int i = 0; i < height.length; i++) {
    		ans += Math.min(rightMax[i], leftMax[i]) - height[i];
    	}
        return ans;
    }
    
    public static void printGrid (boolean[] grid) {
    	for (int i = 0; i < grid.length; i++) {
    		if (grid[i]) {
    			System.out.print("T");
    		} else {
    			System.out.print(" ");
    		}
       	}
    	
    	System.out.println();
    }
}
