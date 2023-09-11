package LeetCode;

import java.util.*;

public class MergeIntervals {
	public static void main (String[] args) {
		int[][] intervals = {{1,4}, {4, 5}};
		
		merge (intervals);
	}
    public static int[][] merge(int[][] intervals) {
    	List<Pair> list = new ArrayList();
    	
    	for (int i = 0; i < intervals.length; i++) {
    		list.add(new Pair (intervals[i][0], 's'));
    		list.add(new Pair (intervals[i][1], 'e'));
    	}
    	
    	Collections.sort(list);
    	    	
    	Stack<Pair> stack = new Stack();
    	
    	List<Num> ans = new ArrayList();
    	
    	for (int i = 0; i < list.size(); i++) {
    		if (!stack.isEmpty() && stack.peek().type == 's' && list.get(i).type == 'e') {
    			Pair lastPopped = stack.pop();
    			
    			if (stack.isEmpty()) {
    				ans.add(new Num (lastPopped.x, list.get(i).x));
    			}
    		} else {
    			stack.push((list.get(i)));
    		}
    	}
    	int[][] arr = new int[ans.size()][2];
    	
    	for (int i = 0; i < ans.size(); i++) {
    		arr[i][0] = ans.get(i).x;
    		arr[i][1] = ans.get(i).y;
    	}
    	
    	return arr;
    }
}
class Num {
	int x;
	int y;
	
	public Num (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString () {
		return x + " " + y;
	}
}
class Pair implements Comparable<Pair> {
	int x;
	char type;
	
	public Pair (int x, char type) {
		this.x = x;
		this.type = type;
	}

	public int compareTo(Pair other) {
		if (this.x == other.x) {
			return -(this.type - other.type);
		}
		return this.x - other.x;
	}
	
	public String toString () {
		return x + " " + type;
	}
}