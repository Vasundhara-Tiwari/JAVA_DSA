package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSumII {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr[0].length; i++){
            ans = Math.min(ans, minFallingPathSum(arr, 0, i));
        }
        System.out.println(ans);
    }
    public static int minFallingPathSum(int[][] grid, int cr, int cc) {
        if(cr == grid.length - 1){
            return grid[cr][cc];
        }
        int[] dp = new int[grid.length];
        Arrays.fill(dp, 99999);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < grid.length; i++){
            if(cc == i){
                continue;
            }
            ans = Math.min(ans, minFallingPathSum(grid, cr+1, i));
        }
        return ans + grid[cr][cc];
    }
}
