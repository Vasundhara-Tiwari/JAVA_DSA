package Assignment3;

import java.util.Scanner;

public class VonNuemanLovesBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] binaryNumbers = new String[n];
        for (int i = 0; i < n; i++) {
            binaryNumbers[i] = scanner.next();
        }
        for (String binaryNum : binaryNumbers) {
            int decimalNum = binaryToDecimal(binaryNum);
            System.out.println(decimalNum);
        }
    }
    private static int binaryToDecimal(String binaryStr) {
        int decimal = 0;
        int power = binaryStr.length() - 1;
        for (char digit : binaryStr.toCharArray()) {
            decimal += Character.getNumericValue(digit) * Math.pow(2, power);
            power--;
        }
        return decimal;
    }
}
