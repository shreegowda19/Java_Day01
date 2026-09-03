import java.util.Arrays;

public class j11 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 1, 5, 2, 9};

        // Step 1: Count unique elements
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }

        // Step 2: Build the output array
        int[] result = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Resulting Array: " + Arrays.toString(result));
    }
}
