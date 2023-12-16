package TwoDimensionalArrays;

import java.util.Arrays;
public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,10}, {4,5,6,20}, {7,8,9,30}};
        for(int i=0; i< arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        spiral(arr);
    }
    public static void spiral(int[][] arr){
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;
        int totalElements = arr.length * arr[0].length;
        int c = 0;
        while(c < totalElements){
            for(int i = minC; i <= maxC && c < totalElements; i++){
                c++;
                System.out.print(arr[minR][i] + " ");
            }
            minR+=1;
            for(int i = minR; i <= maxR && c < totalElements; i++){
                c++;
                System.out.print(arr[i][maxC] + " ");
            }
            maxC-=1;
            for(int i = maxC; i >= minC && c < totalElements; i--){
                c++;
                System.out.print(arr[maxR][i] + " ");
            }
            maxR-=1;
            for(int i = maxR; i >= minR && c < totalElements; i--){
                c++;
                System.out.print(arr[i][minC] + " ");
            }
            minC+=1;
        }
    }

}
