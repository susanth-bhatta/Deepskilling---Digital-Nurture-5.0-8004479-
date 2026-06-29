import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter present value and time in years");
        double presentValue =in.nextDouble();
        double growthRate = 0.10;
        int years =in.nextInt();

        double futureValue = FinancialForecast.calculateFutureValue(
                presentValue,
                growthRate,
                years
        );

        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", futureValue);
    }
}