package LeetCode;

public class AddTwoNumbers {
    public static void main (String[] args) {
    	ListNode l1 = buildListNode("9999999");
    	ListNode l2 = buildListNode("9999");
    	
    	addTwoNumbers(l1, l2);
    }
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans;
        
        int sum = 0;
        boolean carry = false;
        
        String ansString = "";
        
        
        do {
        	if (l1 != null && l2 != null) {
        		int val1 = l1.val;
        		int val2 = l2.val;
        		
        		sum = val1 + val2;
        		
        		if (carry) {
        			sum++;
        		}
        		
        		if (sum > 9) {
        			carry = true;
        		} else {
        			carry = false;
        		}
        		
        		
        		ansString += sum % 10;
        		
        		l1 = l1.next;
        		l2 = l2.next;
        	} else if (l1 == null && l2 != null) {
        		if (carry) {
        			sum = l2.val + 1;
        		} else {
        			sum = l2.val;
        		}
        		
        		if (sum > 9) {
        			carry = true;
        		} else {
        			carry = false;
        		}
        		
        		ansString += sum % 10;
        		
        		l2 = l2.next;
        	} else if (l2 == null && l1 != null) {
        		if (carry) {
        			sum = l1.val + 1;
        		} else {
        			sum = l1.val;
        		}
        		
        		if (sum > 9) {
        			carry = true;
        		} else {
        			carry = false;
        		}
        		
        		ansString += sum % 10;
        		
        		l1 = l1.next;
        	} else {
        		if (carry) {
        			sum = 1;
        		}
        		
        		if (sum > 9) {
        			carry = true;
        		} else {
        			carry = false;
        		}
        		
        		ansString += sum % 10;
        	}
        	
    
        } while (l1 != null || l2 != null || carry);
        
//        System.out.println(ansString);
        
        return ans = buildListNode(ansString);
    }
	
	public static ListNode buildListNode (String s) {
		if (s.length() == 1) {
			return new ListNode ((int)s.charAt(0)-48);
		}
		
		return new ListNode ((int)s.charAt(0)-48, buildListNode(s.substring(1)));
	}
	
	public static String reverse(String s) {
		String reverse = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
}


class ListNode {
     int val;
      ListNode next;
     
      ListNode() {}
     
     ListNode(int val) { 
    	 this.val = val; 
     }
    
      ListNode(int val, ListNode next) { 
    	  this.val = val; this.next = next; 
      }
}
 
