package Assignment4;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(squareRoot(n));
    }

    private static long squareRoot(long n) {
        if(n == 1 || n == 0){
            return 1;
        }
        long low = 1;
        long high = n/2;
        while (low <= high){
            long mid = (low + high ) / 2;
            if(mid * mid == n){
                return mid;
            } else if (mid * mid > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}
