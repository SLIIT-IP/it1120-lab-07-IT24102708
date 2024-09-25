import java.util.Scanner;

public class IT24102708Lab7Q1B {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
    
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            
            int total = 0;

            System.out.print("Enter Marks: ");
            String mark = IN.nextLine();

            String[] markString = mark.split(" ");

            int[] markInt = new int[markString.length];
            for (int j = 0; j < markString.length; j++) {
                markInt[j] = Integer.parseInt(markString[j]);
            }

            for (int k = 0; k < markInt.length; k++) {
                total += markInt[k];
            }

            double avg = total/(float)markInt.length;

            String grade = "";

            if (avg <= 100 && avg >= 75) {
                grade = "Distinction";
            } else if (avg <= 74 && avg >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is: " + avg);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();

        }
    
        IN.close();

    }
}