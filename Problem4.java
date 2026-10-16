import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int totalDays = s.nextInt();
        int weeks = totalDays / 7;
        int remainingDays = totalDays % 7;
        System.out.println(weeks + " weeks and " + remainingDays + " days");
    }
}
