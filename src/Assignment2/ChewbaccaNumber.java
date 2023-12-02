package Assignment2;

import java.util.Scanner;

//public class ChewbaccaNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        long x = scanner.nextLong();
//        long result = 0;
//        long power = 1;
//        while (x > 0) {
//            long digit = x % 10;
//            long invertedDigit = 9 - digit;
//            long minDigit = Math.min(digit, invertedDigit);
//            result += minDigit * power;
//            x /= 10;
//            power *= 10;
//        }
//        System.out.println(result);
//    }
//}
public class ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String result = minimizeNumber(x);
        System.out.println(result);
    }
    private static String minimizeNumber(String x) {
        char[] digits = x.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            int digit = Character.getNumericValue(digits[i]);
            int invertedDigit = 9 - digit;
            digits[i] = (char) (digit < invertedDigit ? digit + '0' : invertedDigit + '0');
            if (digits[0] == '0') {
                digits[0] = '9';
            }
        }
        return new String(digits);
    }
}

