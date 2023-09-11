package LeetCode;

import java.util.*;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		setZeroes(matrix);
	}

	public static void setZeroes(int[][] matrix) {
		printMatrix(matrix);

		List<Pair> list = new ArrayList();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					list.add(new Pair(i, j));
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			fun(list.get(i).x, list.get(i).y, matrix);
		}

		System.out.println();

		printMatrix(matrix);
	}

	public static void fun(int x, int y, int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[x][i] = 0;
		}

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][y] = 0;
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class Pair {
	int x;
	int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
