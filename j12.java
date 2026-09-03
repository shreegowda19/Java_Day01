public class j12 {
    public static void main(String[] args) {
        String str = "string1";

        int[] count = new int[256]; // ASCII array

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.println("Character counts:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}