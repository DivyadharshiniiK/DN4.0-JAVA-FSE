package financialForecast;

import java.util.*;

public class FinancialForecast {

    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return calculateFutureValue(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.10 for 10%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(amount, rate, years);

        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);

        scanner.close();
    }
}
