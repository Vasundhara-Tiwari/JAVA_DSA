package Recursion;

public class CoinTossNoConsecutiveHeads {
    public static void main(String[] args) {
        int n = 4;
        printAllPossibleOutcomesOfCoinToss(n, "");
    }
    public static void printAllPossibleOutcomesOfCoinToss(int n, String result){
        if(n == 0){
            System.out.println(result);
            return;
        }
        if(result.length() == 0 || result.charAt(result.length()-1) != 'H'){
            printAllPossibleOutcomesOfCoinToss(n-1, result+"H");
        }
        printAllPossibleOutcomesOfCoinToss(n-1, result+"T");
    }
}
