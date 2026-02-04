package DevOps_Lab.GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered");
        } else {
            char grade = calculateGrade(marks);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }

    public static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

