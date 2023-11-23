import java.lang.*;
import java.util.*;
public class FinalProject_CS112_SET_B {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int choice;

        System.out.println("""
                Welcome to our Java Program Collection
                Lastname, Firstname Middle name
                Lastname, Firstname Middle name
                Lastname, Firstname Middle name
                Lastname, Firstname Middle name
                Lastname, Firstname Middle name""");
        while (true) {
            System.out.println("\nPress [ENTER] to see the Main Menu");
            if (kbd.hasNextLine()) {
                System.out.print(kbd.nextLine());
                System.out.println("Please choose among the Java Program");
                System.out.println("------------------------------------");
                System.out.println("""
                        1. Determine if a number is a Perfect, Abundant, or Deficient Number
                        2. Determine if a number is a Happy Number
                        3. Inserting an Element in an Array
                        4. Deleting an Element in an Array
                        5. Display the multiplication Table using 2D arrays
                        6. Remove all consonants in a word
                        7. Remove common letters
                        8. Exit Program""");
                System.out.println("------------------------------------");
                System.out.print("Input the number corresponding to your choice:");
                choice = Integer.parseInt(kbd.nextLine());
                System.out.println();
                switch (choice) {
                    case 1:
                        //to do

                    case 2:
                        //to do

                    case 3:
                        //to do

                    case 4:
                        //to do

                    case 5:
                        //to do

                    case 6:
                        System.out.println("Please enter a word "); //asks for user input
                        String consonant = kbd.nextLine();

                        /* the code below will return the string matching regex, replacing all the sequence of
                        characters and replacement string*/
                        String regex = consonant.replaceAll("(?![aeiouAEIOU])[a-z]", " ")
                                    .replaceAll("(?![aeiouAEIOU])[A-Z]", " ");

                        System.out.println("The word "+consonant+"without consonants is: " +regex);

                    case 7:
                        //to do

                    case 8:
                        System.out.println("Thank you for using the program. Good bye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid input");

                }
            } else {
                System.out.println("error");
            }

        }

    }

    // to do
}