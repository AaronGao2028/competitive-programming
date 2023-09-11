package LeetCode;

import java.util.*;

public class NQueens {
	public static void main (String[] args) {
		System.out.println(solveNQueens(9));
	}
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList();
        
        List<Integer> list = new ArrayList();
        
        permute (list, n, ans);
        
        return ans;
    }
    
    public static void permute (List<Integer> list, int n, List<List<String>> ans) {
    	if (list.size() == n) {    		
			List<String> strList = new ArrayList();
			
			for (int x = 0; x < list.size(); x++) {
				String str = "";

				for (int k = 1; k <= n; k++) {
					if (k == list.get(x)) {
						str += "Q";
					} else {
						str += ".";
					}
				}
				
				strList.add(str);
			}
			ans.add(strList);
	   	}
    	
    	for (int i = 1; i <= n; i++) {
    		if (!list.contains(i)) {    			
    			if (list.isEmpty()) {
    				list.add(i);
	    			
	    			permute(list, n, ans);
	    			
	    			list.remove(list.size()-1);
    			} else {
    				boolean good = true;
    				
        			for (int j = 0; j < list.size(); j++) {
        				if (Math.abs(list.size()-j) == Math.abs(list.get(j) - i)) {
        					good = false;		    			
        				}
        			}
        			
       				if (good) {
    					list.add(i);    			
		    			permute(list, n, ans);    		    			
		    			list.remove(list.size()-1);		    			
    				}
    			}
    		}
    	}
    }
}
