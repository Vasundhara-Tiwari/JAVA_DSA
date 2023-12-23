package String;

public class PrintAllSubstrings2 {
    public static void main(String[] args) {
        String s = "Hello";
        printAllSubstrings(s);
    }
    public static void printAllSubstrings(String s){
        for(int i = 1; i <= s.length(); i++){
            for(int j = i; j <= s.length(); j++){
                int start = j - i;
                System.out.print(s.substring(start, j)+" ");
            }
            System.out.println();
        }
    }
}
