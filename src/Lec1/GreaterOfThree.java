package Lec1;

public class GreaterOfThree {
    public static void main(String[] args) {
        int a = 19, b = 16, c = 19;
        if(a>=b && a>=c){
            System.out.println("a is greater");
        } else if(b>=c && b>=a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}
