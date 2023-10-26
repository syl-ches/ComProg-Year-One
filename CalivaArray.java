//Caliva, Mark Chester P.
//October 26, 2023
import java.util.Scanner;
public class CalivaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        double totalGrade = 0;


        String[] subjects = {"Discrete Math" , "Programming" , "Computing"};
        int[] grades = new int[subjects.length];

        for (int i = 0; i < subjects.length;) {
            System.out.println("Enter the grade for "+subjects[i]);
            grades[i] = input.nextInt();

            if (grades [i] > 100 ) {
                System.out.println("Grade must be less than or equal " +
                        "100 and more than or equal 65 ");

            } else if (grades [i] < 65) {
                System.out.println("Grade must be more than or equal" +
                        " 65 and less than or equal 100");

            } else {
                totalGrade+=grades[i];
                i++;
            }
        }

        double average = totalGrade/ subjects.length;

        System.out.println(" --------------------------------------- ");
        System.out.println(" Student Name :      "+name               );
        System.out.println(" --------------------------------------- ");
        System.out.println(" Subject            Scores               ");
        System.out.println(" --------------------------------------- ");
        System.out.println(" Discrete Math:      "+ grades[0]         );
        System.out.println(" Programming:        "+ grades[1]         );
        System.out.println(" Computing:          "+ grades[2]         );
        System.out.println(" --------------------------------------- ");
        System.out.println(" Average:            "+ average           );



    }
}
