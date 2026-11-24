/** LeetCode 2114 - Maximum Number of Words Found in Sentences */
public class ap15 {
    public int mostWordsFound(String[] sentences) {
        int maximum = 0;
        for (String sentence : sentences) {
            maximum = Math.max(maximum, sentence.trim().split("\\s+").length);
        }
        return maximum;
    }
}
