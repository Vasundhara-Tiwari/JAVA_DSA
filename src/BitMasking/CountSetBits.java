package BitMasking;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 1879;
        int count = 0;
        // method 1
//        while(n > 0){
//            if((n&1) != 0){
//                count++;
//            }
//            n >>=1;
//        }
        //method 2
        while(n > 0){
            count++;
            n = n & n-1;
        }
        System.out.println(count);
    }
}
