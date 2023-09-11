package LeetCode;

public class MergeTwoSortedLists {
	public static void main (String[] args) {
		ListNode list1 = new ListNode(2);
		ListNode list2 = new ListNode(1);
		
		mergeTwoLists (list1, list2);
	}
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = null;
        
        if (list1 == null) {
        	return list2;
        } else if (list2 == null) {
        	return list1;
        }
        
        if (list1.val <= list2.val) {
        	head = list1;
        	temp = list1;
        	
        	list1 = list1.next;
        } else {
        	head = list2;
        	temp = list2;
        	
        	list2 = list2.next;
        }
        	
        while (list1 != null && list2 != null) {
    		if (list1.val <= list2.val) {
    			head.next = list1;
    			list1 = list1.next;
    			head = head.next;
    		} else {
    			head.next = list2;
    			list2 = list2.next;
    			head = head.next;
    		}
    	}
    	
    	if (list1 != null) {
    		head.next = list1;
    	}
    	
    	if (list2 != null) {
    		head.next = list2;
    	}
        
        return temp;
    }
}
