public class kaprekar_sequences {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num, asc, desc, diff;
        int[] digits = new int[4];

        System.out.print("Enter a 4-digit number: ");
        num = sc.nextInt();

        while (num != 6174 && num != 0) {
            // Extract digits
            int temp = num;
            for (int i = 0; i < 4; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }

            // Sort digits ascending
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (digits[i] > digits[j]) {
                        int t = digits[i];
                        digits[i] = digits[j];
                        digits[j] = t;
                    }
                }
            }

            // Form ascending & descending numbers
            asc = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
            desc = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];

            diff = desc - asc;

            // Print difference sequence
            System.out.println(diff);

            num = diff;
        }
    }
}
