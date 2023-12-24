package BitMasking;

import java.util.Scanner;

public class TavAndSaDDas {
    // Question Link
    // https://codeforces.com/problemset/problem/535/b
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        // count total numbers 1 less in length than length of number
        System.out.println(index(s));
    }
    public static int index(String s){
        int n = s.length();
        int count = (1 << n) -2;    // Using formula 2^n - 2
        int position = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '7'){
                count += 1 << position;
            }
            position++;
        }
        return count+1;
    }
}
