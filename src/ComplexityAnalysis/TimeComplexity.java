package ComplexityAnalysis;

public class TimeComplexity {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(long i = 0; i < 1000000; i++){
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
