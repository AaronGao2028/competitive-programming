package LeetCode;

import java.util.*;

public class SpiralMatrix {
	public static void main (String[] args) {
		int[][] matrix = {{1}, {2}, {3}, {4}};
		
		spiralOrder (matrix);
	}
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        boolean[][] vis = new boolean[matrix.length][matrix[0].length];
        
        for (int i = 0; i <= Math.min(matrix.length/2, matrix[0].length/2); i++) {
        	fun (list, matrix, i, vis);
        }
        
        for (int i = 0; i < matrix.length; i++) {
        	for (int j = 0; j < matrix[i].length; j++) {
        		if (!vis[i][j]) {
        			list.add(matrix[i][j]);
        		}
        	}
        }
        
      //  System.out.println(list);
        return list;
    }
    
    public static void fun (List<Integer> list, int[][] matrix, int start, boolean[][] vis) {
    	for (int i = start; i < matrix[0].length-1-start; i++) {
    		if (!vis[start][i]) {
    			list.add(matrix[start][i]);
    			vis[start][i] = true;
    		}
    	}

    	for (int i = start; i < matrix.length-1-start; i++) {
    		if (!vis[i][matrix[0].length-1-start]) {
    			list.add(matrix[i][matrix[0].length-1-start]);
    			vis[i][matrix[0].length-1-start] = true;
    		}
    	}
    	
    	for (int i = matrix[0].length-1-start; i > start; i--) {
    		if (!vis[matrix.length-1-start][i]) {
    			list.add(matrix[matrix.length-1-start][i]);
    			vis[matrix.length-1-start][i] = true;
    		}
    	}
    	
    	for (int i = matrix.length-1-start; i > start; i--) {
    		if (!vis[i][start]) {
    			list.add(matrix[i][start]);
    			vis[i][start] = true;
    		}
    	}
    }
}
