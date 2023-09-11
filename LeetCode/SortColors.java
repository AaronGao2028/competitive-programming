package LeetCode;

public class SortColors {
    public void sortColors(int[] nums) {
        int numZeros = 0;
        int numOnes = 0;
        int numTwos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZeros++;
            } else if (nums[i] == 1) {
                numOnes++;
            } else {
                numTwos++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < numZeros) {
                nums[i] = 0;
            } else if (i < numZeros + numOnes) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
