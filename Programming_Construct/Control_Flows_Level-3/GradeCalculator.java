import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter Physics marks: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = scanner.nextDouble();

        // Assuming total marks per subject = 100
        double totalMarks = 300;
        double obtainedMarks = physics + chemistry + maths;

        // Calculate average percentage
        double averagePercentage = (obtainedMarks / totalMarks) * 100;

        // Grade and remarks based on percentage
        String grade;
        String remarks;

        if (averagePercentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averagePercentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averagePercentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (averagePercentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averagePercentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display output
        System.out.printf("\nAverage Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}