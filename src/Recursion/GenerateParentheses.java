package Recursion;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        parentheses(n, 0, 0, "");
    }
    public static void parentheses(int n, int open, int close, String ans){
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(open > n || close > open){
            return;
        }
        parentheses(n, open+1, close, ans + "(");
        parentheses(n, open, close+1, ans + ")");
    }
}
