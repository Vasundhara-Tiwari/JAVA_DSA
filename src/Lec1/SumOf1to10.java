package Lec1;

public class SumOf1to10 {
    public static void main(String[] args) {
        int i = 1, s = 0;
        while( i<= 10){
            s += i;
            i++;
        }
        System.out.println(s);
    }
}
