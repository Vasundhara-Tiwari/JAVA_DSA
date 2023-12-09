package Searching;

public class KthRoot {
    public static void main(String[] args) {
        int maximum = 157;
        int k = 3;
        System.out.println(search(maximum, k));
    }
    public static int search(int number, int k){
        int start = 1;
        int end = number;
        int result = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(Math.pow(mid, k) <= number){
                result = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
}
