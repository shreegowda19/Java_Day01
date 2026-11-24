/** LeetCode 1732 - Find the Highest Altitude */
public class ap9 {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;
        for (int change : gain) {
            altitude += change;
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}
