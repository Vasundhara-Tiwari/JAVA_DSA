package Assignment3;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr){
        int half = arr.length / 2;
        boolean[] visited = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                if(count > half){
                    return arr[i];
                }
            }
        }
        return arr[0];
    }
}
