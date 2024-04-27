package DynamicProgramming;

public class DistinctSubsequences {
    public static void main(String[] args) {

    }
    public static int numDistinctTD(String s, String t, int i, int j, int[][] dp){
        if(j == t.length()){
            return 1;
        }
        if(i == s.length()){
            return 0;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int inc=0, exc = 0;
        if(s.charAt(i) == t.charAt(j)){
            inc = numDistinctTD(s, t, i+1, j+1, dp);
        }
        exc = numDistinctTD(s, t, i+1, j, dp);
        return dp[i][j] = inc + exc;
    }
    public static int numDistinctBU(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int i = 1; i < dp[0].length; i++){
            dp[0][i] = 1;
        }
        for(int a = 1; a < dp.length; a++){
            for(int i = 1; i < dp[0].length; i++){
                int inc = 0;
                int exc = 0;
                if(a >= t.charAt(i -1)){
                    inc = dp[a - t.charAt(i -1)][i];
                }
                exc = dp[a][i-1];
                dp[a][i] = inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
