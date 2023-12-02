package Assignment2;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextLong();
        long decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println(decimalNumber);
    }
    private static long binaryToDecimal(long binary) {
        long decimal = 0;
        long power = 0;
        while (binary > 0) {
            long digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        return decimal;
    }
}

