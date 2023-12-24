package BitMasking;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 1879;
        int count = 0;
        while(n > 0){
            if((n&1) != 0){
                count++;
            }
            n >>=1;
        }
        System.out.println(count);
    }
}
