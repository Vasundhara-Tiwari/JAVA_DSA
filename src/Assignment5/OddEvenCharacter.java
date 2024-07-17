package Assignment5;

import java.util.Scanner;

public class OddEvenCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0){
                ans += (char)(str.charAt(i) + 1);
            } else {
                ans += (char)(str.charAt(i) - 1);
            }
        }
        System.out.println(ans);
    }
}
