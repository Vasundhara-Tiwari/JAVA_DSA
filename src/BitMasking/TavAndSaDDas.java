package BitMasking;

import java.util.Scanner;

public class TavAndSaDDas {
    // Question Link
    // https://codeforces.com/problemset/problem/535/b
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

    }
    public static int index(String s){
        int n = s.length();
        int count = (1 << n) -2;    // Using formula 2^n - 2
        return count;
    }
}
