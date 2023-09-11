package LeetCode;

public class EditDistance {
	public static void main (String[] args) {
		String word1 = "zoologicoarchaeologist";
		String word2 = "zoopsychologist";
		System.out.println(minDistance (word1, word2));
	}
    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        int[][] dp = new int[n+1][m+1];
        
        for (int i = 1; i <= n; i++) {
        	dp[i][0] = i;
        }
        
        for (int i = 1; i <= m; i++) {
        	dp[0][i] = i;
        }
        
        for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= m; j++) {
        		if (word1.charAt(i-1) == word2.charAt(j-1)) {
        			dp[i][j] = dp[i-1][j-1];
        		} else {
        			dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
        		}
        	}
        }
        
        return dp[n][m];
    }
    
    public static void printGrid (int[][] dp) {
    	for (int i = 0; i < dp.length; i++) {
    		for (int j = 0; j < dp[i].length; j++) {
    			System.out.print(dp[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}
