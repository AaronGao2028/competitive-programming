package LeetCode;

public class MergekSortedLists {
	public static void main (String[] args) {
		ListNode[] lists = new ListNode[3];
		
		lists[0] = new ListNode (1, new ListNode (4, new ListNode (5)));
		lists[1] = new ListNode (1, new ListNode (3, new ListNode (4)));
		lists[2] = new ListNode (2, new ListNode (6));
				
		mergeKLists (lists);
	}
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ListNode temp = head;
    	int min = Integer.MAX_VALUE;
    	boolean notAllEmpty = true;
    	
        for (int i = 0; i < lists.length; i++) {        	
        	if (lists[i] != null && min > lists[i].val) {
        		min = lists[i].val;
        	}
        }
        
        for (int i = 0; i < lists.length; i++) {
        	if (lists[i] != null && min == lists[i].val) {
        		head = lists[i];
        		temp = lists[i];
        		lists[i] = lists[i].next;
        		
        		break;
        	}
        }
        
        while (notAllEmpty) {
        	notAllEmpty = false;
        	min = Integer.MAX_VALUE;
        	
	        for (int i = 0; i < lists.length; i++) {
	        	if (lists[i] != null && min > lists[i].val) {
	        		min = lists[i].val;
	        		notAllEmpty = true;
	        	}
	        }
	        
	        for (int i = 0; i < lists.length; i++) {
	        	if (lists[i] != null && min == lists[i].val) {
	        		head.next = lists[i];
	        		lists[i] = lists[i].next;
	        		head = head.next;
	        		
	        		break;
	        	}
	        }
	    }
        
        return temp;
    }
}
