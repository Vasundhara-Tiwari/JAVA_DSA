package Generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0){
            int n = scanner.nextInt();
            Pair[] arr = new Pair[n];
            for(int i = 0; i < arr.length; i++){
                int st = scanner.nextInt();
                int et = scanner.nextInt();
                arr[i] = new Pair(st, et);
            }

            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.end - o2.end;
                }
            });
            int activity = 1;
            int end = arr[0].end;
            for(int i = 0; i < arr.length; i++){
                if(arr[i].start >= end){
                    activity++;
                    end = arr[i].end;
                }
            }
            System.out.println(activity);
            test--;
        }
    }
    static class Pair{
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
