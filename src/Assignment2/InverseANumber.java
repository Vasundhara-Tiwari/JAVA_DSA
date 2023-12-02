package Assignment2;

import java.util.Scanner;

public class InverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int inverse = getInverse(number);
        System.out.println(inverse);
    }
    private static int getInverse(int number) {
        int result = 0;
        int position = 1;
        while (number > 0) {
            int digit = number % 10;
            result = result + position * (int) Math.pow(10, digit - 1);
            position++;
            number /= 10;
        }
        return result;
    }
}

