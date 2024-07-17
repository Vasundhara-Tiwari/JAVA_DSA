package Assignment5;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 91 && str.charAt(i) >= 65){
                ans += (char)(str.charAt(i) + 32);
            } else {
                ans += (char)(str.charAt(i) - 32);
            }
        }
        System.out.println(ans);
    }
}
