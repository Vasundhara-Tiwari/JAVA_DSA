package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] arr = new int[size];
//        for(int i = 0; i < size; i++){
//            arr[i] = scanner.nextInt();
//        }
//        int queries = scanner.nextInt();
//        int[] query = new int[queries];
//        for(int i = 0; i < queries; i++){
//            query[i] = scanner.nextInt();
//        }
//        for(int i = 0; i < query.length; i++){
//            query[i] = query[i] % size;
//            int ele;
//            if(query[i] != 0){
//                ele = arr[size-query[i]];
//            }
//            else{
//                ele = arr[0];
//            }
//            for(int j = size-1; j > 0; j--){
//                int indexToAdd = j-query[i];
//                if(indexToAdd < 0){
//                    indexToAdd = arr.length + indexToAdd;
//                }
//                arr[j] += arr[indexToAdd];
//            }
//            arr[0] += ele;
//        }
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.println((int)(sum % (Math.pow(10, 9)+7)));
//    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int size =sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i = 0; i< size; i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int operation =sc.nextInt();
        }
        int modulus =(int)Math.pow(10,9)+7;
        sum*=(int)Math.pow(2,q);
        sum=sum% modulus;
        System.out.println(sum);
    }
}
