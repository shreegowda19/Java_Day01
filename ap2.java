/** LeetCode 1672 - Richest Customer Wealth */
public class ap2 {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int bank : customer) wealth += bank;
            richest = Math.max(richest, wealth);
        }
        return richest;
    }
}
