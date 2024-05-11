import java.util.Scanner;

public class GasCostCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("The number of gallons of gas in the tank: ");
        double gallonsInTank = scanner.nextDouble();

        System.out.print("enter the fuel efficiency: ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("enter the prise of gallons: ");
        double priseOfGallon = scanner.nextDouble();

        double costPer100Miles = (100 * priseOfGallon) / fuelEfficiency;
        System.out.println("Cost per 100 miles: " + String.format("%.2f", costPer100Miles));

        double distance = fuelEfficiency * gallonsInTank;

        System.out.println("the car can go almost " + String.format("%.2f", distance) + " km with the gas.");

        scanner.close();
    }
}
