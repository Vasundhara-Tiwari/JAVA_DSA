package BitMasking;

import java.util.Scanner;

public class MagicNumber {
    //    A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5+25), 125, 130(125+5), ....
    //    Write a function to find the nth Magic number.
    //    Example:
    //    Input: n = 2
    //    Output: 25
    //    Input: n = 5
    //    Output: 130
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int multiplier = 5;
        int result = 0;
        while(n > 0){
            if((n&1) != 0){
                result += multiplier;
            }
            n >>= 1;
            multiplier *= 5;
        }
        System.out.println(result);
    }
}
