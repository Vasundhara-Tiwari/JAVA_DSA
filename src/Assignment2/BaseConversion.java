package Assignment2;

import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sb = scanner.nextInt();
        int db = scanner.nextInt();
        int sn = scanner.nextInt();
        int result = convertBase(sn, sb, db);
        System.out.println(result);
    }
    private static int convertBase(int number, int sourceBase, int destinationBase) {
        int decimalNumber = convertToDecimal(number, sourceBase);
        return convertFromDecimal(decimalNumber, destinationBase);
    }
    private static int convertToDecimal(int number, int base) {
        int decimalNumber = 0;
        int power = 0;
        while (number > 0) {
            int digit = number % 10;
            decimalNumber += digit * Math.pow(base, power);
            number /= 10;
            power++;
        }
        return decimalNumber;
    }
    private static int convertFromDecimal(int decimalNumber, int base) {
        int result = 0;
        int power = 1;
        while (decimalNumber > 0) {
            int digit = decimalNumber % base;
            result += digit * power;
            decimalNumber /= base;
            power *= 10;
        }
        return result;
    }
}

