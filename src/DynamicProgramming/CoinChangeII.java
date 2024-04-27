package DynamicProgramming;

public class CoinChangeII {
    public static void main(String[] args) {
        int[]  coins = {1, 2, 5};
        int amount = 5;
        int[][] dp = new int[amount+1][coins.length];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i < dp[0].length; i++){
            dp[0][i] = 0;
        }
//        System.out.println(numDistinctTD(coins, amount, 0, dp));
        System.out.println(coinChangeBU(amount, coins));
    }
    public static int coinChange(int[] coin, int amount, int i, int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(i == coin.length){
            return 0;
        }
        if(dp[amount][i] != 0){
            return dp[amount][i];
        }
        int inc=0, exc=0;
        if(amount >= coin[i]){
            inc = coinChange(coin, amount-coin[i], i, dp);
        }
        exc = coinChange(coin, amount, i+1, dp);
        return dp[amount][i] = inc+exc;
    }
    public static int coinChangeBU(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length+1];
        for(int i = 1; i < dp[0].length; i++){
            dp[0][i] = 1;
        }
        for(int a = 1; a < dp.length; a++){
            for(int i = 1; i < dp[0].length; i++){
                int inc = 0;
                int exc = 0;
                if(a >= coins[i -1]){
                    inc = dp[a -coins[i -1]][i];
                }
                exc = dp[a][i-1];
                dp[a][i] = inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
