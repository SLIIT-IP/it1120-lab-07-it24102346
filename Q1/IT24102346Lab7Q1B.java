import java.util.Scanner;

public class IT24102346Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Process for three students
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks for student " + i + " (four subjects separated by space): ");
            double subject1 = scanner.nextDouble();
            double subject2 = scanner.nextDouble();
            double subject3 = scanner.nextDouble();
            double subject4 = scanner.nextDouble();

            // Calculate average
            double average = (subject1 + subject2 + subject3 + subject4) / 4;

            // Determine grade based on average
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            // Display the result for the student
            System.out.printf("Student %d - Average Marks: %.2f, Grade: %s%n", i, average, grade);
        }

        scanner.close();
    }
}
