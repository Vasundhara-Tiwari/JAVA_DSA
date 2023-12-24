package BitMasking;

public class CheckIThBit {
    public static void main(String[] args) {
        int n = 68;
        int i = 4;
        int mask = 1 << i;
        if((n&mask) != 0){
            System.out.println("Bit is 1");
        }
        else{
            System.out.println("Bit is 0");
        }
    }
}
