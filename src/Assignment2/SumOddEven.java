package Assignment2;

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOdd = 0, sumEven = 0, counter = 1;

        while (num != 0) {
            if (counter % 2 == 0)
                sumEven += num % 10;
            else
                sumOdd += num % 10;
            num /= 10;
            counter++;
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
