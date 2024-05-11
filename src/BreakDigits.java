import java.util.Scanner;

public class BreakDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a non-negative integer with at most five digits: ");
        int number = scanner.nextInt();

         scanner.close();

        int digitCount = String.valueOf(number).length();

        System.out.print("The individual digits are: ");
        for (int i = digitCount - 1; i >= 0; i--) {
            int digit = (number / (int)Math.pow(10, i)) % 10;
            System.out.print(digit + " ");
        }
    }
}
