package LeetCode;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 7 }, { 10, 11, 16, 21 }, { 23, 30, 34, 60 } };
        int target = 20;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int lowValue = 0;
        int highValue = numRows * numCols - 1;

        while (lowValue <= highValue) {
            int midValue = (lowValue + highValue) / 2;

            int x = midValue / numCols;
            int y = midValue % numCols;

            if (target > matrix[x][y]) {
                lowValue = midValue + 1;
            } else if (target < matrix[x][y]) {
                highValue = midValue - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
