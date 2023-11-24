import java.util.Scanner;

public class GradeCalc {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mt_w = 0.3;
        double hw_w = 0.2;
        double pr_w = 0.2;
        double fin_w = 0.5;


        System.out.println("Enter midterm grade:");

        double midtermExam = input.nextDouble();


        System.out.println("Enter Homework grade:");
        double homework = input.nextDouble();

        System.out.println("Enter Project grade:");
        double project = input.nextDouble();

        System.out.println("Enter Final grade:");
        double finalExam = input.nextDouble();

        double cumulativeGrade = mt_w * midtermExam + hw_w * homework + pr_w * project + fin_w * finalExam;


        if (cumulativeGrade < 30) {
            System.out.printf("Cum Grade is %.2f, letter grade is %s", cumulativeGrade, "D");
        } else if (cumulativeGrade < 50) {
            System.out.printf("Cum Grade is %.2f, letter grade is %s", cumulativeGrade, "C");
        } else if (cumulativeGrade < 80) {
            System.out.printf("Cum Grade is %.2f, letter grade is %s", cumulativeGrade, "B");
        } else {
            System.out.printf("Cum Grade is %.2f, letter grade is %s", cumulativeGrade, "A");
        }



    }


}