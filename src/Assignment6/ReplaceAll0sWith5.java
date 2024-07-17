package Assignment6;

import java.util.Scanner;

public class ReplaceAll0sWith5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(replaceZero(n, 0));
    }

    private static int replaceZero(int n, int ans) {
        if(n == 0){
            return 5;
        }
        ans += 10 * replaceZero(n%10, ans);
        return ans;
    }

}
