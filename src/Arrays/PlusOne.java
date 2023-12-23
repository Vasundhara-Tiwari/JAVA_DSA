package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 9};
        int[] arr2 = {2, 3, 4, 5, 6, 9};
        addArrays(arr1, arr2);
    }
    public static void addArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> al = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        while( i >= 0 && j >= 0){
            al.add((arr1[i] + arr2[j] + carry)%10);
            carry = (arr1[i] + arr2[j] + carry)/10;
            i--;
            j--;
        }
        while (i >= 0){
            al.add((arr1[i] + carry)%10);
            carry = (arr1[i] + carry)/10;
            i--;
        }
        while (j >= 0){
            al.add((arr2[j] + carry)%10);
            carry = (arr2[j] + carry)/10;
            j--;
        }
        if(carry>0){
            al.add(carry);
        }
        int[] result = new int[al.size()];
        int start = 0;
        for(int k = al.size()-1; k >= 0; k--){
            result[start] = al.get(k);
            start++;
        }
        System.out.println(Arrays.toString(result));
    }
}
