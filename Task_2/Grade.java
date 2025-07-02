import java.util.*;

public class Grade {
    public static double total_sum(double DSA, double OOPs, double COA, double JAVA, double OS) {
        double sum = (DSA + OOPs + COA + JAVA + OS);
        return sum;
    }

    public static double avgOfMarks(double sumOfAllSubjectMarks) {
        double avg = sumOfAllSubjectMarks / 5;
        return avg;
    }

    public static String gradeAsign(double averageMarks) {
        String grade;
        if (averageMarks >= 91 && averageMarks <= 100) {
            grade = "A+";
        } else if (averageMarks >= 81) {
            grade = "A";
        } else if (averageMarks >= 71) {
            grade = "B+";
        } else if (averageMarks >= 61) {
            grade = "B";
        } else if (averageMarks >= 51) {
            grade = "C+";
        } else if (averageMarks >= 41) {
            grade = "C";
        } else if (averageMarks >= 33) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Marks subject wise you got in Exam");
        System.out.print("Enter DSA marks:- ");
        double DSA = sc.nextDouble();
        System.out.print("Enter OOPs marks:- ");
        double OOPs = sc.nextDouble();
        System.out.print("Enter COA marks:- ");
        double COA = sc.nextDouble();
        System.out.print("Enter JAVA marks:- ");
        double JAVA = sc.nextDouble();
        System.out.print("Enter OS marks:- ");
        double OS = sc.nextDouble();
        if (DSA < 0 || DSA > 100 || OOPs < 0 || OOPs > 100 || COA < 0 || COA > 100 || JAVA < 0 || JAVA > 100 || OS < 0 || OS > 100) {
        System.out.println("Invalid Marks it should be under 100");
        return; // Stop program if input is invalid
    }
        double sumOfAllSubjectMarks = total_sum(DSA, OOPs, COA, JAVA, OS);
        double AvgerageMarks = avgOfMarks(sumOfAllSubjectMarks);
        System.out.println("Your Grade Assign "+ gradeAsign(AvgerageMarks));
        System.out.println("Your average marks " + AvgerageMarks);
    }
}