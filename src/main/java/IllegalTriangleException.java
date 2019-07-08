import java.io.IOException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void checkTriangle() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter side 1 = ");
            double a = scanner.nextInt();
            System.out.println("Enter side 2 = ");
            double b = scanner.nextInt();
            System.out.println("Enter side 3 = ");
            double c = scanner.nextInt();
            if ((a > 0 && b > 0 && c > 0) && ((a + b > c) || (a + c > b) || (b + c > a))) {
                System.out.println("The triangle is valid.");
            } else {
                throw new Exception("Invalid");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
