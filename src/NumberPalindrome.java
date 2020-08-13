public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number == 0) {
            return false;
        } else {
            int a = number;
            int reverse = 0;
            int lastDigit;
            if (number > 0) {

                while (number > 0) {
                    lastDigit = number % 10;
                    number /= 10;
                    reverse *= 10;
                    reverse += lastDigit;
                  //System.out.println(reverse);
                }

            } else {
                while (number < 0) {
                    lastDigit = number % 10;
                    number /= 10;
                    reverse *= 10;
                    reverse += lastDigit;
                  //System.out.println(reverse);
                }

            }
            if (a == reverse) {
                return true;
            } else {
                return false;
            }
        }
    }
}