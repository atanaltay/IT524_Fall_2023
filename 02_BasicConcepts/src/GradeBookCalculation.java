import java.util.Scanner;

public class GradeBookCalculation {


    public static void main(String[] args) {

        //4 components:
        //midterm: 0.30
        //hw : 0.2
        //project: 0.2
        //final : 0.30

        // 100-90 -> A
        // 90-80 ->B
        //80-70 -> C
        // <70 -> D

        double midtermW =  0.3;
        double hwW = 0.2;
        double projectW = 0.2;
        double finalW = 0.3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter midterm grade:");
        double midterm= sc.nextDouble();

        System.out.println("Enter homework grade:");
        double homework= sc.nextDouble();

        System.out.println("Enter project grade:");
        double project= sc.nextDouble();

        System.out.println("Enter final grade");
        double finalG = sc.nextDouble();

        double cumulativeGrade = midtermW*midterm +
                                    hwW*homework +
                                    projectW*project +
                                    finalW*finalG;

        String letterGrade = "";

        if(cumulativeGrade<70){
           letterGrade = "D";
        }else if(cumulativeGrade<80){
            letterGrade = "C";
        } else if (cumulativeGrade<90) {
            letterGrade = "B";
        }else{
            letterGrade = "A";
        }


        System.out.printf("Cumulative grade is %.2f, letter grade is: %s",
                                            cumulativeGrade,
                                                letterGrade);





    }

}
