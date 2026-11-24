public class sp10 {
 
        public String toLowerCase(String s) {
                char[] arr = s.toCharArray();
                        for (int i = 0; i < arr.length; i++) {
                                    // Uppercase letters range from 'A' (65) to 'Z' (90)
                                                if (arr[i] >= 'A' && arr[i] <= 'Z') {
                                                                arr[i] = (char)(arr[i] + 32); // Convert to lowercase
                                                                            }
                                                                                    }
                                                                                            return new String(arr);
                                                                                                }
                                                                                                }


