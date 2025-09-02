public class kaprekar {
    public static void main(String[] args) {
        int number = 2381, target = 0;
        int[] digits = new int[4];

        while(target>=0) {
            int tempNumber = number;
            for (int i = 0; i < digits.length; i++) {
                digits[i] = tempNumber % 10;
                tempNumber /= 10;
            }

           
            for (int i = 0; i < digits.length - 1; i++) {
                for (int j = 0; j < digits.length - 1 - i; j++) {
                    if (digits[j] > digits[j + 1]) {
                        int temp = digits[j];
                        digits[j] = digits[j + 1];
                        digits[j + 1] = temp;
                    }
                }
            }

         
            int min = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
            int max = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];

            target = max - min;

            System.out.println("Max: " + max + ", Min: " + min + ", Target: " + target);

       number=target;
       if(target==6174)
       {
    	   break;
       }

        }
        }
    }


       
        