package LeetCode;

import java.util.*;

public class Permutations {
	public static void main (String[] args) {
        int[] nums = {1, 2, 3};
        
        System.out.println(permute (nums));
	}
    public static List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> ans = new ArrayList();
    	
        List<Integer> list = new ArrayList();
        
        permute (nums, list, ans);
        
        return ans;
    }
    
    public static void permute (int[] nums, List<Integer> list, List<List<Integer>> ans) {
    	if (list.size() == nums.length) {
    		
    		List<Integer> clone = new ArrayList();
    		
    		for (int i = 0; i < list.size(); i++) {
    			clone.add(list.get(i));
    		}
    		
    		ans.add(clone);
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (!list.contains(nums[i])) {
    			list.add(nums[i]);
    			
    			permute (nums, list, ans);
    			
    			list.remove(list.size()-1);
       		}   
    	}
    }
}
