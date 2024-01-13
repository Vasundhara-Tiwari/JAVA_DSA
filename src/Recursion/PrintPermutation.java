package Recursion;

public class PrintPermutation {
    public static void main(String[] args) {
        String ques = "abb";
        printPermutation(ques, "");
        System.out.println();
        printPermutationWithoutDuplicates(ques, "");
    }
    public static void printPermutation(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        for(int i = 0; i < ques.length(); i++){
            String que = ques.substring(0, i) + ques.substring(i+1);
            printPermutation(que, ans+ques.charAt(i));
        }
    }
    public static void printPermutationWithoutDuplicates(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        for(int i = 0; i < ques.length(); i++){
            String que = ques.substring(0, i) + ques.substring(i+1);
            char ch = ques.charAt(i);
            boolean flag = false;
            for(int j = i+1; j < ques.length(); j++){
                if(ques.charAt(j) == ch){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                printPermutationWithoutDuplicates(que, ans+ch);
            }
        }
    }
}
