package Assignment6;

import java.util.Scanner;

public class AllSubsequences {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printAllSubsequence(str, "");
        System.out.println("\n"+count);
    }

    private static void printAllSubsequence(String str, String ans) {
        if (str.length() == 0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch = str.charAt(0);
        String part = str.substring(1);
        printAllSubsequence(part, ans);
        printAllSubsequence(part, ans+ch);
    }
}
