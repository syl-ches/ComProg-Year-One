package prelim;

import java.util.Scanner;
public class StudentList {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        StudentList myProgram;
        try {
            myProgram = new StudentList();
            myProgram.run();
        } catch (Exception ex){
            ex.printStackTrace();
        }

        System.exit(0);
    }// end of main method

    public void run() {
        Student[] list;
        int number;
        number = readInteger("How many students will be listed? ",1,55);
//System.out.print("How many students will be listed? ");
//number = Integer.parseInt(keyboard.nextLine());
        list = new Student[number];
        System.out.println("Enter the student information.");
        for (int x = 0; x < list.length; x++) {
            System.out.println("For student " + (x + 1) + " :");
            list[x] = readStudent(list);
        }

        System.out.println();
        System.out.println("Unsorted List");
        showList(list);
        System.out.println();
        System.out.println("Sorted List");
        sortList(list);
        showList(list);
    }

    private void showList(Student[] studs) {
        for (int x = 0; x < studs.length; x++) {
            System.out.println(studs[x].toString());
        }
    }

    private Student readStudent(Student[]list) {
        Student s;
        boolean duplicateFound;
        do {
            duplicateFound = false;
            System.out.print("first name: ");
            String f = keyboard.nextLine();
            System.out.print("middle name: ");
            String m = keyboard.nextLine();
            System.out.print("last name: ");
            String l = keyboard.nextLine();
            int a = readInteger("age: ", 15, 100);
            double g = readDouble("Grade Point Average: ", 65, 99);

            s = new Student(f, m, l, a, g);

            // Check for duplicates
            for (Student student : list) {
                if (student != null && student.equals(s)) {
                    duplicateFound = true;
                    System.out.println("This student already exists. Please enter different details.");
                    break;
                }
            }
        } while (duplicateFound);

        return s;
    }

    /* Note! Using the last name as the sort key is not sufficient
for a realistic set of records.
This method may need improvement */
    private void sortList(Student[] s) {
        Student temp;
        int minIndex = 0;
        for (int x = 0; x < s.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < s.length; y++) {
                if(s[minIndex].getLastName().compareToIgnoreCase(s[y].getLastName()) > 0)
                    minIndex = y;
            }
            if (minIndex != x) {
                temp = s[x];
                s[x] = s[minIndex];
                s[minIndex] = temp;
            }
        }
    } // end of sortList method

    /**
     * Returns an integer read from the keyboard. The integer must be
     * in the range lowLimit to upLimit.
     */
    public int readInteger(String promptMessage, int lowLimit, int upLimit){
        Scanner scanner = new Scanner(System.in);
        int value = -1;
        boolean validValueRead = false;
        while( !validValueRead) {
            try { System.out.print(promptMessage + ": ");
                value = Integer.parseInt(scanner.nextLine());
                if (value < lowLimit ){
                    System.out.println("You must enter an integer that is not lower than "+lowLimit+".");
                } else
                if (value > upLimit) {
                    System.out.println("You must enter an integer that is not greater than "+ upLimit+".");
                } else
                    validValueRead = true;
            } catch (NumberFormatException x){
                validValueRead = false;
                System.out.println("You may have entered an invalid integer.");
                System.out.println("Try again. ");
            } // end of catch
        } // end of while
        return value;
    } // end of readInteger method

    /**
     * Returns a floating point number of type double that is read
     * from the keyboard. The number must be
     * in the range lowLimit to upLimit.
     */
    public double readDouble(String promptMessage, double lowLimit, double upLimit){
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        boolean validValueRead = false;
        while( !validValueRead) {
            try { System.out.print(promptMessage + ": ");
                value = Double.parseDouble(scanner.nextLine());
                if (value < lowLimit ){
                    System.out.println("You must enter an integer that is not lower than "+lowLimit+".");
                } else
                if (value > upLimit) {
                    System.out.println("You must enter an integer that is not greater than "+ upLimit+".");
                } else
                    validValueRead = true;

            } catch (NumberFormatException x){
                validValueRead = false;
                System.out.println("You may have entered an invalid value.");
                System.out.println("Try again. ");
            } // end of catch
        } // end of while
        return value;
    } // end of readDouble method
} // end of class

