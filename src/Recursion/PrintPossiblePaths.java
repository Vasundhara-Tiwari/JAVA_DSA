package Recursion;

public class PrintPossiblePaths {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        printPossiblePath(0, 0, n-1, m-1, "");
    }
    public static void printPossiblePath(int cc, int cr, int ec, int er, String ans){
        if(cc == ec || cr == er) {
            System.out.println(ans);
            return;
        }
        printPossiblePath(cc+1, cr, ec, er, ans+"H");
        printPossiblePath(cc, cr+1, ec, er, ans+"V");
    }
}
