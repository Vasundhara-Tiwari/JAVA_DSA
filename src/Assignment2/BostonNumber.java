package Assignment2;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = isBostonNumber(number);
        System.out.println(result);
    }
    private static int isBostonNumber(int n) {
        int primeFactorSum = sumOfPrimeFactors(n);
        int digitSum = sumOfDigits(n);
        return (primeFactorSum == digitSum) ? 1 : 0;
    }
    private static int sumOfPrimeFactors(int n) {
        int sum = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sum += sumOfDigits(i);
                n /= i;
            }
        }
        if (n > 1) {
            sum += sumOfDigits(n);
        }
        return sum;
    }
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

