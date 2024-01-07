package Recursion;

public class PrintAllPossibleOutcomesOfCoinToss {
    public static void main(String[] args) {
        int n = 3;
        printAllPossibleOutcomesOfCoinToss(n, "");
    }
    public static void printAllPossibleOutcomesOfCoinToss(int n, String result){
        if(n == 0){
            System.out.println(result);
            return;
        }
        printAllPossibleOutcomesOfCoinToss(n-1, result+"H");
        printAllPossibleOutcomesOfCoinToss(n-1, result+"T");
    }
}
