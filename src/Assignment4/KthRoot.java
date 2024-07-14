package Assignment4;

import java.util.Scanner;

public class KthRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0){
            String str = scanner.next();
            long n = Long.parseLong(str);
            int k = scanner.nextInt();
            long ans = 1;
            long low = 1;
            long high = n;
            while(low <= high){
                long mid = (low + high) / 2;
                if(Math.pow(mid, k) > n){
                    high = mid-1;
                } else {
                    ans = mid;
                    low = mid+1;
                }
            }
            System.out.println(ans);
            test--;
        }
    }
}
