package Stack;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(construct(s));
    }
    public static String construct(String pattern){
        int[] ans = new int[pattern.length()+1];
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= pattern.length(); i++){
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                ans[i] = count;
                count++;
                while (!stack.isEmpty()){
                    ans[stack.pop()] = count;
                    count++;
                }
            } else{
                stack.push(i);
            }
        }
        String out = "";
        for(int i = 0; i < ans.length; i++){
            out += ans[i];
        }
        return out;
    }
}
