import java.util.Scanner;

public class IT24102346Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();
        
        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();
        
        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();
        
        System.out.print("Enter marks for subject 4: ");
        double subject4 = scanner.nextDouble();

       
        double average = (subject1 + subject2 + subject3 + subject4) / 4;

        
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

       
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

