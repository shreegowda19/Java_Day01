/** LeetCode 27 - Remove Element */
public class ap12 {
    public int removeElement(int[] nums, int val) {
        int kept = 0;
        for (int num : nums) {
            if (num != val) nums[kept++] = num;
        }
        return kept;
    }
}
