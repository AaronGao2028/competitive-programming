package LeetCode;

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class RemoveNthNodeFromEndofList {
	public static void main (String[] args) {
		ListNode node = new ListNode (1, new ListNode (2));
		
		removeNthFromEnd (node, 2);
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode fast = head;
    	ListNode slow = head;
    	int counter = 0;
    	
    	//Return an empty linked list
    	if (head.next == null && n == 1) {
    		return null;
    	}
    	do {
    		fast = fast.next;
    		counter++;
    		
    		if (counter > n) {    			
    			slow = slow.next;
    		}
    		
    	} while (fast.next != null);
		
    	//Remove head of linked list
    	if (counter == n-1) {
    		return head.next;
    	}
    	
    	//Remove the tail of linked list
    	if (slow.next.next == null) {
    		slow.next = null;
    	} else {
    		slow.next = slow.next.next;
    	}
    	
    	return head;
    }
    
}


