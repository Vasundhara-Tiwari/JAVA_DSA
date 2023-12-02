package Assignment2;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(scn.hasNextInt()) {
            int num = scn.nextInt();
            sum = sum + num;
            if(num > -1000 && num < 1000) {
                if(sum >= 0)
                    System.out.println(num);
                else
                    break;
            }
        }
    }
}
