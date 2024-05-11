import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double forthPower = Math.pow(number, 4);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Forth power: " + forthPower);

        scanner.close();    }
}
