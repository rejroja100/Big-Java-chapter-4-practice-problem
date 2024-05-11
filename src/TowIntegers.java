import java.util.Scanner;

public class TowIntegers {
    public static void main(String[] args) {

        System.out.println("Enter the first number: ");

        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the first number: ");
        int secondInteger = scanner.nextInt();

        int sum = firstInteger + secondInteger;
        int difference = firstInteger - secondInteger;
        int product = firstInteger * secondInteger;
        double average = sum / 2.0;
        int absolute = Math.abs(difference);
        int minimum = Math.min(firstInteger, secondInteger);
        int maximum = Math.max(firstInteger, secondInteger);

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("average = " + average);
        System.out.println("absolute = " + absolute);
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);

        scanner.close();
    }
}
