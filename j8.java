public class j8 {
    public static void main(String[] args) {
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);
            result.append(revWord.reverse().toString()).append(" ");
        }

        System.out.println("Reversed: \"" + result.toString().trim() + "\"");
    }
}
