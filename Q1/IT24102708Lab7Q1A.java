import java.util.Scanner;

public class IT24102708Lab7Q1A {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);

        System.out.println("Enter marks for four subjects: ");
        
        int count = 1;
        int total = 0;

        while (count < 5) {
            System.out.print("Enter Subject Mark " + count + ": ");
            int mark = IN.nextInt();

            if (!(mark >= 0 && mark <= 100)) {
                System.out.println("Invalid Input. Marks must between 0 and 100.");
                continue;
            }

            total += mark;
            count++;

        }

        double avg = total/4.0;

        String grade = "";

        if (avg <= 100 && avg >= 75) {
            grade = "Distinction";
        } else if (avg <= 74 && avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("\nAverage is: " + avg);
        System.out.println("Overall Grade is: " + grade);
    
        IN.close();

    }
}