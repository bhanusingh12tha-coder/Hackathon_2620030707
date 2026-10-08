import java.util.Scanner;

class Student {
    String studentName;
    double rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    public Student(String studentName, double rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public double calculateFee() {
        return this.courseCredits * 1500.0;
    }

    public boolean checkEligibility() {
        return this.marks >= 50.0;
    }

    public double calculateScholarship(double totalFee) {
        if (this.marks >= 85.0) {
            return totalFee * 0.20; 
        } else if (this.marks >= 70.0 && this.marks <= 84.0) {
            return totalFee * 0.10; 
        } else {
            return 0.0; 
        }
    }

    public double calculateFinalFee(double totalFee, double scholarship) {
        return totalFee - scholarship;
    }

    public void displayDetails() {
        double totalFee = calculateFee();
        double scholarship = calculateScholarship(totalFee);
        double finalFee = calculateFinalFee(totalFee, scholarship);

        System.out.println("\n--- Student Course Registration Details ---");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
        System.out.println("Course Name  : " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligible     : " + (checkEligibility() ? "Yes" : "No"));
        System.out.println("Total Fee    : Rs. " + totalFee);
        System.out.println("Scholarship  : Rs. " + scholarship);
        System.out.println("Final Fee    : Rs. " + finalFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        double roll = sc.nextDouble();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        Student student = new Student(name, roll, marks, courseName, credits);

        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Failed: Student is not eligible. Marks must be 50 or above.");
        }

        sc.close();
    }
}

