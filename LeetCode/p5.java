class Solution {
    public int countDigits(int num) {
        int count = 0;
        int originalNum = num;
        
        while (num > 0) {
            int digit = num % 10;
            // Check if the digit divides the original number
            if (originalNum % digit == 0) {
                count++;
            }
            num /= 10; // Remove the last digit
        }
        
        return count;
    }
}
