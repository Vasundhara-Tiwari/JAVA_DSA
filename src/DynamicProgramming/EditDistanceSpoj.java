package DynamicProgramming;

public class EditDistanceSpoj {
    public static void main(String[] args) {
        String str1 = "FOOD";
        String str2 = "MONEY";
        System.out.println(editDistance(str1, str2, 0, 0));
    }
    public static int editDistance(String str1, String str2, int i, int j){
        if(i == str1.length()){
            return str2.length() - j;
        }
        if(j == str2.length()){
            return str1.length() - i;
        }
        int ans = 0;
        if(str1.charAt(i) == str2.charAt(j)){
            ans = editDistance(str1, str2, i+1, j+1);
        } else {
            int D = editDistance(str1, str2, i+1, j);
            int R = editDistance(str1, str2, i+1, j+1);
            int I = editDistance(str1, str2, i, j+1);
            ans = Math.min(D, Math.min(R, I))  + 1;
        }
        return ans;
    }
}
