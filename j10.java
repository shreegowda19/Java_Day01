import java.util.Arrays;

public class j10 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int nonZeroIdx = 0;

        // Place non-zero elements at the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIdx++] = arr[i];
            }
        }

        // Fill remaining space with zeros
        while (nonZeroIdx < arr.length) {
            arr[nonZeroIdx++] = 0;
        }

        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}
