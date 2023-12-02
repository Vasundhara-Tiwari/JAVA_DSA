package Assignment2;

import java.util.Scanner;

public class OddEvenRule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] carNumbers = new int[N];
        for (int i = 0; i < N; i++) {
            carNumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (isAllowedOnSunday(carNumbers[i])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    private static boolean isAllowedOnSunday(int carNumber) {
        int sumEven = 0;
        int sumOdd = 0;
        while (carNumber > 0) {
            int digit = carNumber % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            carNumber /= 10;
        }
        return (sumEven % 4 == 0) || (sumOdd % 3 == 0);
    }
}

