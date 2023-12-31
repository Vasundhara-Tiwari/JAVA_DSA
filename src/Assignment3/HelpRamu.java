package Assignment3;

import java.util.Scanner;

public class HelpRamu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases >0) {
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int c3 = scanner.nextInt();
            int c4 = scanner.nextInt();
            int rickshaw = scanner.nextInt();
            int cabs = scanner.nextInt();
            int[] ai = new int[rickshaw];
            int[] bi = new int[cabs];
            for (int i = 0; i < rickshaw; i++) {
                ai[i] = scanner.nextInt();
            }
            for (int i = 0; i < cabs; i++) {
                bi[i] = scanner.nextInt();
            }
            int result = calculateMinimumCost(c1, c2, c3, c4, rickshaw, cabs, ai, bi);
            System.out.println(result);
            testCases--;
        }
        scanner.close();
    }
    private static int calculateMinimumCost(int c1, int c2, int c3, int c4, int rickshaw, int cabs, int[] ai, int[] bi) {
        int totalRickshawCost = 0;
        for (int i = 0; i < rickshaw; i++) {
            totalRickshawCost += Math.min(ai[i] * c1, c2);
        }
        totalRickshawCost = Math.min(totalRickshawCost, c3);
        int totalCabCost = 0;
        for (int i = 0; i < cabs; i++) {
            totalCabCost += Math.min(bi[i] * c1, c2);
        }
        totalCabCost = Math.min(totalCabCost, c3);
        int totalFinalCost = Math.min(totalRickshawCost + totalCabCost, c4);
        return totalFinalCost;
    }
}

