import java.util.*;

public class j3 {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequencies: " + counts);
    }
}
