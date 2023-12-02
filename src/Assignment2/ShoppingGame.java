package Assignment2;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            String result = findWinner(M, N);
            System.out.println(result);
        }
    }
    private static String findWinner(int M, int N) {
        int totalAayush = 0;
        int totalHarshit = 0;
        int i = 1;
        while (true) {
            if (i % 2 == 1) {
                totalAayush += i;
                if (totalAayush > M) {
                    return "Harshit";
                }
            } else {
                totalHarshit += i;
                if (totalHarshit > N) {
                    return "Aayush";
                }
            }
            i++;
        }
    }
}
