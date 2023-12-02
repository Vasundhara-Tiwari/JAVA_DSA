package Assignment2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minFahrenheit = scanner.nextInt();
        int maxFahrenheit = scanner.nextInt();
        int step = scanner.nextInt();
        for (int fahrenheit = minFahrenheit; fahrenheit <= maxFahrenheit; fahrenheit += step) {
            int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
            System.out.println(fahrenheit + " " + celsius);
        }
    }
}

