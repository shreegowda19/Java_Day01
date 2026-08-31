
    import java.util.Scanner; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reverse Number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed number: " + rev);

        // Reverse String
        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Better approach: use StringBuilder
        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed string: " + reverse);

        sc.close();
    }


