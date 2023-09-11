package LeetCode;

public class ClimbingStairs {
	public static void main (String[] args) {
		System.out.println(climbStairs(4));
	}
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        
        for (int i = 0; i < dp.length; i++) {
        	dp[i] = -1;
        }
        
        dp[1] = 1;
        dp[0] = 1;
        
        return fun(n, dp);
    }
    
    public static int fun (int n, int[] dp) {
    	if (n < 0) {
    		return 0;
    	}
    	if (dp[n] != -1) {
    		return dp[n];
    	} else {
    		return dp[n] = fun(n-1, dp) + fun(n-2, dp);
    	}
    }
}
