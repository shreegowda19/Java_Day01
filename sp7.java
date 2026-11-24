public class sp7 {
  
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1 = 0, c1 = 0; // pointer for word1 array and character inside word1[w1]
        int w2 = 0, c2 = 0; // pointer for word2 array and character inside word2[w2]

        while (w1 < word1.length && w2 < word2.length) {
            if (word1[w1].charAt(c1) != word2[w2].charAt(c2)) {
                return false;
            }

            c1++;
            if (c1 == word1[w1].length()) {
                w1++;
                c1 = 0;
            }

            c2++;
            if (c2 == word2[w2].length()) {
                w2++;
                c2 = 0;
            }
        }

        // Both arrays must be completely exhausted to represent the exact same string
        return w1 == word1.length && w2 == word2.length;
    }
}

