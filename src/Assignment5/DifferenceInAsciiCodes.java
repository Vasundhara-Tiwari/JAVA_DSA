package Assignment5;

import java.util.Scanner;

public class DifferenceInAsciiCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans = ""+str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            int diff = str.charAt(i) - str.charAt(i-1);
            ans += diff;
            ans += str.charAt(i);
        }
        System.out.println(ans);
    }
}
