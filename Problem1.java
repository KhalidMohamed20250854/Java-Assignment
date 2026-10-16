import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = s.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.printf("Area = %.2f\n", area);
        System.printf("Circumference = %.2f\n", circumference);
    }
}
