import java.util.Scanner;

public class RemoveZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number between 1000 to 999999: ");

        String number = scanner.nextLine();
        String numberWithoutComma = number.replace(",", "");

        System.out.println("The number without comma is " + numberWithoutComma + ".");

        scanner.close();
    }
}
