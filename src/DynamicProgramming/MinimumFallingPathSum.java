package DynamicProgramming;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr[0].length; i++){
            ans = Math.min(ans, minFallingPathSum(arr, 0, i));
        }
        System.out.println(ans);
    }
    public static int minFallingPathSum(int[][] grid, int cr, int cc) {
        if(cc < 0 || cc >= grid[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(cr == grid.length - 1){
            return grid[cr][cc];
        }
        int leftDiagonal = minFallingPathSum(grid, cr + 1, cc - 1);
        int rightDiagonal = minFallingPathSum(grid, cr + 1, cc + 1);
        int down = minFallingPathSum(grid, cr + 1, cc);
        return Math.min(leftDiagonal, Math.min(rightDiagonal, down)) + grid[cr][cc];
    }
}
