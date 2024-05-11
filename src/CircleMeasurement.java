import java.util.Scanner;

public class CircleMeasurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

       double circleArea = Math.PI * Math.pow(radius, 2);
        double circleCircumference = 2 * Math.PI * radius;

        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Circumference of the circle: " + circleCircumference);
        System.out.println("Volume of the sphere: " + sphereVolume);
        System.out.println("Surface area of the sphere: " + sphereSurfaceArea);

        scanner.close();
    }
}

