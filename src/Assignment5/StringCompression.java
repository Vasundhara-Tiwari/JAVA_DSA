package Assignment5;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans = ""+str.charAt(0);
        int sum = 1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) != str.charAt(i)){
                if (sum > 1){
                    ans += sum;
                }
                ans += str.charAt(i);
                sum = 1;
            } else {
                sum++;
            }
        }
        if (sum > 1){
            ans += sum;
        }
        System.out.println(ans);
    }
}
