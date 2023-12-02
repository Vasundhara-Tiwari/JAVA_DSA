package Assignment2;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                temp++;
                break;
            }
        }
        if (temp == 0 && num != 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
