package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCowSpoj {

    //input
//    5 3
//            1
//            2
//            8
//            4
//            9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] stalls = new int[n];
        for(int i = 0; i < n; i++){
            stalls[i] = sc.nextInt();
        }
        Arrays.sort(stalls);
        System.out.println(minimumDistance(n, c, stalls));
    }
    public static int minimumDistance(int n, int c, int[] stalls){
        int start = 0;
        int end = stalls[n-1] - stalls[0];
        int result = 0;
        while (start <= end){
            int mid = (start+end)/2;
            if(isPossible(stalls, c, mid)){
                result = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
    public static boolean isPossible(int[] stalls, int c, int distance){
        int cows = 1;
        int lastCowPosition = stalls[0];
        for(int i=1; i<stalls.length; i++)
        {
            if(stalls[i]-lastCowPosition >= distance)
            {
                cows++;
                lastCowPosition=stalls[i];
                if(cows==c) return true;
            }
        }
        return false;
    }
}
