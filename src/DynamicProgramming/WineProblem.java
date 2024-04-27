package DynamicProgramming;

public class WineProblem {
    public static void main(String[] args) {
        int[] winePrices = {2, 3, 5, 1, 4};
        int[][] dp = new int[winePrices.length][winePrices.length];
        System.out.println(maxProfitTD(winePrices, 0, winePrices.length-1, 1, dp));
    }
    public static  int maxProfitTD(int[] wine, int si, int ei, int year, int[][] dp){
        if(si > ei){
            return 0;
        }
        if(dp[si][ei] != 0){
            return dp[si][ei];
        }
        int fs = wine[si] * year + maxProfitTD(wine, si+1, ei, year+1, dp);
        int ls = wine[ei] * year + maxProfitTD(wine, si, ei-1, year+1, dp);
        return dp[si][ei] = Math.max(fs, ls);
    }
    public static  int maxProfitBU(int[] wine){
        int[][] dp = new int[wine.length][wine.length];
        int year = wine.length;
        for(int i = 0; i < dp.length; i++){
            dp[i][i] = year * wine[i];
        }
        year--;
        for(int gap = 1; gap < wine.length; gap++){
            for(int j = gap; j < wine.length; j++){
                int i = j - gap;
                int fs = wine[i] * year + dp[i+1][j];
                int ls = wine[j] * year + dp[i][j-1];
                dp[i][j] = Math.max(fs, ls);
            }
            year--;
        }
        return dp[0][dp[0].length-1];
    }
}
