package Assignment2;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isArmstrongNumber(num));
    }
    private static int order(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    private static boolean isArmstrongNumber(int number) {
        int numDigits = order(number);
        int temp = number;
        int result = 0;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, numDigits);
            temp /= 10;
        }
        return result == number;
    }
}
