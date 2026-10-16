import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three scores: ");
        int score1 = s.nextInt();
        int score2 = s.nextInt();
        int score3 = s.nextInt();
        double average = (score1 + score2 + score3) / 3.0;
        long roundedAverage = Math.round(average);
        System.out.println(roundedAverage);
        System.out.printf("%.2f\n", average);
    }
}
