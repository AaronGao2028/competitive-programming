package LeetCode;

public class RotateImage {
	public static void main (String[] args) {
    	int[][] matrix = {{1, 2}, {3, 4}};
    	
    	printMatrix(matrix);
    	System.out.println();
    	rotate(matrix);

    	printMatrix(matrix);
	}
	
	public static void printMatrix (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length/2; i++) {
			for (int j = 0; j < matrix.length - 2*i - 1; j++) {
				turn (matrix, i);
			}
		}
    } 
    
    public static void turn (int[][] matrix, int start) {
    	int oldValue = matrix[start][start];
    	int curValue = matrix[start][start];
    	
    	for (int i = 1 + start; i < matrix.length - start; i++) {
    		curValue = matrix[start][i];
    		matrix[start][i] = oldValue;
    		oldValue = curValue;
    	}
    	
    	for (int i = 1 + start; i < matrix.length - start; i++) {
    		curValue = matrix[i][matrix.length-1-start];
    		matrix[i][matrix.length-1-start] = oldValue;
    		oldValue = curValue;
    	}
    	
    	for (int i = matrix.length-2-start; i >= start; i--) {
    		curValue = matrix[matrix.length-1-start][i];
    		matrix[matrix.length-1-start][i] = oldValue;
    		oldValue = curValue;
    	}
    	
    	for (int i = matrix.length-2-start; i >= start; i--) {
    		curValue = matrix[i][start];
    		matrix[i][start] = oldValue;
    		oldValue = curValue;
    	}
    }
}
