package LeetCode;

public class ContainerWithMostWater {
	public static void main (String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(maxArea(arr));
	}
    public static int maxArea(int[] height) {
    	int maxArea = 0;
    	
        int left = 0;
        int right = height.length-1;
        
        while (left < right) {
        	maxArea = Math.max(maxArea, Math.min(height[right], height[left]) * (right-left));
        	
        	if (height[left] <= height[right]) {
        		left++;
        	} else {
        		right--;
        	}
        }
        
        return maxArea;
    }
}
