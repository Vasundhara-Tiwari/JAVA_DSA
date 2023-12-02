package Assignment2;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 0;
        int i=1;
        while(count < num1) {
            int num = (3*i)+2;
            if(num%num2!=0){
                System.out.println(num);
                count++;
            }
            i++;
        }
    }
}
