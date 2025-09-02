package com.studyopedia;

public class Cupbreakerconstant {
    public static void main(String[] args) {
        int number = 3124;
        int steps = 0;
        int size = 4;
        int difference = 0;

        while (number != 6174) {
            int digits[] = {0, 0, 0, 0};
            int temp = number;

            for (int i = 3; i >= 0; i--) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }
            
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (digits[j] > digits[j + 1]) {
                        int t = digits[j];
                        digits[j] = digits[j + 1];
                        digits[j + 1] = t;
                    }
                }
            }

            int minimum = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
            int maximum = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];

            difference = maximum - minimum;
            steps++;

            System.out.printf("Step %d: %04d - %04d = %04d\n", steps, maximum, minimum, difference);

            if (difference == 0) {
                System.out.println("Reached 0, cannot continue Kaprekar routine.");
                break;
            }

            number = difference;  // **Update number here**
        }

        if (number == 6174) {
            System.out.println("Reached 6174 in " + steps + " steps.");
        }
    }
}
