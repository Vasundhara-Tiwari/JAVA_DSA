package Assignment2;

import java.util.Scanner;

public class PrintArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        findArmstrong(num1, num2);
    }
    static void findArmstrong(int low, int high) {
        for (int i = low + 1; i < high; ++i) {
            int copy = i;
            int num = 0;
            while (copy != 0) {
                copy /= 10;
                ++num;
            }
            int pow_sum = 0;
            copy = i;
            while (copy != 0) {
                int digit = copy % 10;
                pow_sum += Math.pow(digit, num);
                copy /= 10;
            }
            if (pow_sum == i)
                System.out.println(i);
        }
    }
}
