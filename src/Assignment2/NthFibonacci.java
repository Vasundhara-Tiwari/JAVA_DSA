package Assignment2;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0, b = 1, c;
        if (num == 0){
            System.out.println(a);
            return;
        }
        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
