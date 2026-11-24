/** LeetCode 283 - Move Zeroes */
public class ap13 {
    public void moveZeroes(int[] nums) {
        int nextNonZero = 0;
        for (int num : nums) {
            if (num != 0) nums[nextNonZero++] = num;
        }
        while (nextNonZero < nums.length) {
            nums[nextNonZero++] = 0;
        }
    }
}
