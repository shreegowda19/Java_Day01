import java.util.*;

public class j2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 1, 5, 2, 9};
        
        // Using LinkedHashSet to preserve order while removing duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        System.out.println("Array after removing duplicates: " + set);
    }
}
