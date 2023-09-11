package LeetCode;

public class BestTimetoBuyandSellStock {
			
	public static void main (String[] args) {
		int[] arr = {7,6,4,3,1};
		
		System.out.println(maxProfit(arr));
	}
    public static int maxProfit(int[] prices) {
        int max = 0;
        
        int left = 0;
        int right = 1;
        
        if (prices.length == 1) {
        	return 0;
        } 
        
        while (right < prices.length) {
        	if (prices[right] > prices[left]) {
        		max = Math.max(max, prices[right] - prices[left]);
        		right++;
        	} else {
        		left = right;
        		right = right + 1;
        	}
        }
        
        return max;
    }
}
