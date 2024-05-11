import java.util.Scanner;

public class LengthConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the measurement in meters: ");
            double meters = scanner.nextDouble();

            double miles = meters * 0.00062;

            double feet = meters * 3.28;

            double inches = meters * 39.37;

            System.out.println("Measurement in miles: " + miles);
            System.out.println("Measurement in feet: " + feet);
            System.out.println("Measurement in inches: " + inches);

            scanner.close();
        }
}
