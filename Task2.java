
import java.util.Scanner;
public class MarkCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter the marks obtained in subject " + i + " (out of 100):");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }
        double averagePercentage = totalMarks / (numSubjects * 100) * 100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        if (averagePercentage >= 90) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: C");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
