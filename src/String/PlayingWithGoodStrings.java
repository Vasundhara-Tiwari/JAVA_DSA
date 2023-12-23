package String;

import java.util.Scanner;

public class PlayingWithGoodStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = 0;
        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            if(checkVowel(str.charAt(i))){
                len++;
                ans = Math.max(ans, len);
            }
            else{
                len = 0;
            }
        }
        System.out.println(ans);
    }
    public static boolean checkVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}
