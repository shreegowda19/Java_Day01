/** LeetCode 1431 - Kids With the Greatest Number of Candies */
public class ap5 {
    public boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        for (int candy : candies) greatest = Math.max(greatest, candy);

        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= greatest;
        }
        return result;
    }
}
