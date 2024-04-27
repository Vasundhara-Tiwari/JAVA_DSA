package DynamicProgramming;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(arr, 0, 0));
    }
    public static int minPathSum(int[][] grid, int cr, int cc) {
        if(cr == grid.length-1 && cc == grid[0].length-1){
            return grid[cr][cc];
        }
        if(cr >= grid.length || cc >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        int right = minPathSum(grid, cr, cc+1);
        int down = minPathSum(grid, cr+1, cc);
        return Math.min(right, down) + grid[cr][cc];
    }
}
