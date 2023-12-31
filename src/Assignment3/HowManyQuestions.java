package Assignment3;

import java.util.Scanner;

public class HowManyQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n > 0){
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++){
                arr[i] = scanner.nextInt();
            }
            int countNum = 0;
            for(int i = 0; i < 3; i++){
                countNum += arr[i];
            }
            if(countNum >= 2){
                count++;
            }
            n--;
        }
        System.out.println(count);
    }
}
