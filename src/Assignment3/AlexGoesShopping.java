package Assignment3;

import java.util.Scanner;
public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int queries = scanner.nextInt();
        while (queries>0) {
            int amount = scanner.nextInt();
            int k = scanner.nextInt();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (amount % arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            queries--;
        }
    }
}
