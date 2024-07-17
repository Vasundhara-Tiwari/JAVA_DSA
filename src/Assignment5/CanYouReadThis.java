package Assignment5;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) < 91 && str.charAt(i) >= 65){
                System.out.println();
            }
            System.out.print(str.charAt(i));
        }
    }
}
