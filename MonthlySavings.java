import java.util.Scanner;
public class MonthlySavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving: ");
        double monthlySaving = input.nextDouble();

        input.nextLine();

        final double MONTHLY_RATE = 0.05 / 12;

        double month1Value = monthlySaving * (1 + MONTHLY_RATE);

        System.out.printf("%2f\n", month1Value);

        double month2Value = (month1Value + monthlySaving) * (1 + MONTHLY_RATE);

        System.out.printf("%2f\n", month2Value);

        double month3Value = (month2Value + monthlySaving) * (1 + MONTHLY_RATE);

        System.out.printf("%2f\n", month3Value);

        double month4Value = (month3Value + monthlySaving) * (1 + MONTHLY_RATE);

        System.out.printf("%2f\n", month4Value);

        double month5Value = (month4Value + monthlySaving) * (1 + MONTHLY_RATE);

        System.out.printf("%2f\n", month5Value);

        double month6Value = (month5Value + monthlySaving) * (1 + MONTHLY_RATE);

        System.out.printf("%2f\n", month6Value);

    }
}
