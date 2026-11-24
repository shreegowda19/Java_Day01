/** LeetCode 2215 - Find the Difference of Two Arrays */
public class ap14 {
    public java.util.List<java.util.List<Integer>> findDifference(int[] nums1, int[] nums2) {
        java.util.Set<Integer> first = new java.util.HashSet<>();
        java.util.Set<Integer> second = new java.util.HashSet<>();
        for (int num : nums1) first.add(num);
        for (int num : nums2) second.add(num);

        java.util.Set<Integer> onlyFirst = new java.util.HashSet<>(first);
        java.util.Set<Integer> onlySecond = new java.util.HashSet<>(second);
        onlyFirst.removeAll(second);
        onlySecond.removeAll(first);

        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        result.add(new java.util.ArrayList<>(onlyFirst));
        result.add(new java.util.ArrayList<>(onlySecond));
        return result;
    }
}
