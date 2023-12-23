package String;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        s=s.trim();
        String result = "";
        int lastIndex = s.length()-1;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                System.out.println(s.substring(i+1, lastIndex+1));
                result += s.substring(i+1, lastIndex+1) + " ";
                lastIndex = i-1;
            }
        }
        result += s.substring(0, lastIndex+1);
        return result;
    }
}
