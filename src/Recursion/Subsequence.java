package Recursion;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        printAllSubsequence(s, "");
    }
    public static void printAllSubsequence(String str, String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        char ans = str.charAt(0);
        String part = str.substring(1);
        printAllSubsequence(part, result+ans);
        printAllSubsequence(part, result);
    }
}
