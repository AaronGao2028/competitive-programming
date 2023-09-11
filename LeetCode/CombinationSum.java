package LeetCode;

import java.util.*;

public class CombinationSum {
	static List<List<Integer>> list;
	
	public static void main (String[] args) {
		int[] candidates = {2};
		int target = 1;
		
		System.out.println(combinationSum (candidates, target));
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	list = new ArrayList();
    	
    	fun (null, target, candidates, 0);
    	
    	return list;
    }
    
    public static void fun (List<Integer> curList, int target, int[] candidates, int index){     	
    	if (target == 0) {
    		List<Integer> clone = new ArrayList();
    		
    		for (int i = 0; i < curList.size(); i++) {
    			clone.add(curList.get(i));
    		}
    		
    		list.add(clone);
    		
    		curList.remove(curList.size()-1);
    		
    		return;
    	}
    	
    	boolean canBeReduced = false;
    	
    	for (int i = index; i < candidates.length; i++) {
    		if (target >= candidates[i]) {
    			canBeReduced = true;
    		}
    	}
    	
    	if (!canBeReduced){    		
    		if (curList != null)
    		curList.remove(curList.size()-1);
    		
    		return;
    	}
    	
    	for (int i = index; i < candidates.length; i++) {
    		if (target >= candidates[i]) {
    			if (curList == null) {
    				curList = new ArrayList();
    			}
    			
    			curList.add(candidates[i]);
    			
    			fun (curList, target-candidates[i], candidates, i);
    		}
    	}
    	
    	if (!curList.isEmpty())
    	curList.remove(curList.size()-1);
    }
}
