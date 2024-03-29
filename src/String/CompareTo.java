package String;

public class CompareTo {
    public static void main(String[] args) {
        String s1 = "Komal";
        String s2 = "Kunal";
        System.out.println(compareTo(s1, s2));
    }
    public static int compareTo(String s1, String s2){
        if(s1 == s2){
            return 0;
        }
        int length = Math.min(s1.length(), s2.length());
        for(int i = 0; i < length; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return (s1.charAt(i)-s2.charAt(i));
            }
        }
        return s1.length() - s2.length();
    }
}
