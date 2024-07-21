package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
//        Arrays.fill(dp, 0);
        System.out.println(fibTopDown(n, dp));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int n1 = fib(n-1);
        int n2 = fib(n-2);
        return n1 + n2;
    }
    public static int fibTopDown(int n, int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){     // applying dp
            return dp[n];
        }
        int n1 = fibTopDown(n-1, dp);
        int n2 = fibTopDown(n-2, dp);
        return dp[n] = n1 + n2;     // remembering values
    }

    public static int fibBottomUp(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
