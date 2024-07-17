package Assignment6;

import java.util.Scanner;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generateParentheses(n, "", 0, 0);
    }

    private static void generateParentheses(int n, String ans, int open, int close) {
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(close < open) {
            generateParentheses(n, ans + ")", open, close+1);
        }
        if(open < n){
            generateParentheses(n, ans +"(", open+1, close);
        }
    }
}
