package LeetCode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
	public static void main (String[] args) {
		int[] a = {2};
		int[] b = {};
		 
		System.out.println(findMedianSortedArrays(a,b));
	}
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int sum = nums1.length + nums2.length;
    	double[] nums = new double[sum];
    	
    	int p1 = 0;
    	int p2 = 0;
    	
    	while (p1 + p2 < sum) {
    		if (nums1.length==p1) {
    			nums[p1+p2] = nums2[p2];
    			p2++;
    		} else if (nums2.length==p2) {
    			nums[p1+p2] = nums1[p1];
    			p1++;
    		} else {
    			if (nums1[p1] <= nums2[p2]) {
    				nums[p1+p2] = nums1[p1];
    				p1++;
    			} else {
    				nums[p1+p2] = nums2[p2];
    				p2++;
    			}
    		}
    	}
    	
    	if (sum % 2 == 1) {
    		return nums[sum/2];
    	} else {
    		return (nums[sum/2] + nums[sum/2-1])/2;
    	}
	}
}
