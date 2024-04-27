package DynamicProgramming;

public class WineProblem {
    public static void main(String[] args) {
        int[] winePrices = {2, 3, 5, 1, 4};
        System.out.println(maxProfit(winePrices, 0, winePrices.length-1, 1));
    }
    public static  int maxProfit(int[] wine, int si, int ei, int year){
        if(si > ei){
            return 0;
        }
        int fs = wine[si] * year + maxProfit(wine, si+1, ei, year+1);
        int ls = wine[ei] * year + maxProfit(wine, si, ei-1, year+1);
        return Math.max(fs, ls);
    }
}
