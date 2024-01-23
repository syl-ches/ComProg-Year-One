/**
 (Hypothetical Annual Water Bill Summary Problem )
 The water bills for the 12 months of a year by a water service
 subscriber is summarized as follows.
 Inputs:
 Water Meter Reading at the beginning of the year (i.e. January 1)
 Water Meter Readings at the end of each of the 12 months
 Payment Rates (Minimum Bill, price of water per cubic meter)
 Outputs:
 Cubic meters of water consumed for each month (monthly consumption)
 Amount paid for each month based on given rates (monthly payment)
 Average of monthly consumptions
 Average of monthly payments
 The month during which the amount of water consumed is highest
 The month during which the amount of water consumed is lowest
 Algorithm
 1.Read the name of the water consumer (consumer).
 2.Read The classification (cType) of the consumer such
 that the only valid values for cType is "commercial" or "residential".
 3.Read water meter reading in cubic meters at the beginning of the year(previousR[0]).
 4.For month 1 to 12
 Read the water meter reading in cubic meters at the end of the month (presentR) such
 that presentR cannot be less than previousR. Store the value in an array.
 Compute the volume of water consumed for the month (consumption)
 by subtracting the previousR from presentR. Store the value in an array.
 Compute the amount due (amountDue) from the consumer based on
 the following rules
 If cType is residential and consumption <= 12, the amount due is 180.00
 If cType is residential and consumption > 12, the amount due is 180.00 + (consumption –
 12)*30.00
 If cType is commercial and consumption <= 30, the amount due is 600.00

 If cType is commercial and consumption > 30, the amount due is 600.00 + (consumption –
 30)*50.00
 Store the value in an array.
 5. Determine the average of the monthly water consumptions.
 6. Determine the average of the monthly payments.
 7. Determine the month during which water consumed is highest.
 8. Determine the month during which water consumed is least.
 9. Print the name of the consumer.
 10. Print the consumer type.
 11. Print the water meter reading at the beginning of the year.
 12. Print a table showing the 12 months, water meter readings at
 the end of each month, the amount paid due to the water
 consumption for each month.
 13. Print the average of the monthly water consumptions.
 14. Print the average of the monthly payments.
 15. Print the month during which water consumption is highest.
 16. Print the month during which water consumption is lowest.
 */


import java.lang.*;
import java.util.Scanner;
public class MarkChesterCalivaWaterBillAnnualSummary {


    public static void main(String[] args){

        int [] presentReading= new int[12];
        int [] startReading= new int[12];
        Scanner scanner = new Scanner(System.in);

        String consumer=""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int[] nCMUsed = new int[12]; /* to hold number of cubic meters of water used for 12
months */
        int minCMResidential=12; //to hold cut-off for minimum Bill for residential consumers
        double minBillResidential=180.00; // minimum bill for <= 12 Cubic Meters used
        float rateResidential =30.00F; //cost of 1 Cubic Meter above the min. consumption
        int minCMCommercial=30; /* to hold cut-off for minimum Bill for commercial consumers*/
        double minBillCommercial=600.00; // minimum bill for <= 20Cubic Meters used
        float rateCommercial =50.00F; /*cost of 1 Cubic Meter above the min. consumption for
commercial consumers*/

        double[] amountDue= new double[12]; // to hold the amount paid for 12 months
        showIntroduction();
        System.out.print("Enter the name of the water consumer: ");
        consumer = scanner.nextLine();
        cType = readTypeOfConsumer();
        startReading[0] = readStartReading();

        for (int index=0; index < nCMUsed.length; index++){
            presentReading[index] = readEndOfMonthReading(startReading[index], (index+1));
            if (index < (nCMUsed.length - 1))
                startReading[index+1] = presentReading[index];
            nCMUsed[index] = presentReading[index] - startReading[index];
            amountDue[index] = computeAmountDue(nCMUsed[index], cType, minCMResidential,
                    minBillResidential, minCMCommercial, minBillCommercial, rateResidential, rateCommercial);
        }

        showSummary(consumer, cType, startReading, presentReading, nCMUsed, amountDue);
        System.exit(0);
    } // end of main method

    /**
     *Computes and returns the average of the elements an array of floating point numbers*/
    public static double computeAverage(double[] values){
        double total=0; // to hold the total of all elements
        double average=0; // to hold the average
        for (double element : values) // add the elements
            total = total + element;
//compute the average
        average = total/values.length ; // total divided by number of elements
        return average;
    }
    /**
     *Computes and returns the average of the elements an array of integers
     */
    public static double computeAverage(int[] values){
        double total=0; // to hold the total of all elements
        double average=0; // to hold the average
        for (int element : values) // add the elements
            total = total + element;
//compute the average
        average = (double) total/values.length ; //total divided by number of elements
        return average;
    }
    /**
     * The following method finds and returns the index of the element with the lowest value
     * from an array of positive integers.
     * The Linear Search algorithm is applied.*/
    public static int findLowest(int[] values){
        int minIndex = 0; // Initialize the index of the minimum value

        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i; // Update the index of the minimum value
            }
        }

        return minIndex;
    }
    /**
     *Finds and returns the index of the element with the highest value from an array of
     integers*/
    public static int findHighest(int[] values){
        int maxIndex = 0; // Initialize the index of the maximum value

        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[maxIndex]) {
                maxIndex = i; // Update the index of the maximum value
            }
        }

        return maxIndex;

    }

    // REQUIRED: Show the algorithm through a multiline comment
    /* Algorithm:
        1. Print the name of the consumer taken from the main method.
        2. Show if the consumer is residential or commercial through the char t using if statements.
        3. Show the water meter at the beginning of the year taken from the user.
        4. Print the table header to be used.
        5. Using a for loop to print the formatted reading, cubic meter consumed, and amount paid.
           All computed in the methods used in the program.
        6. Iterate through each month and print the details in a formatted manner.
        7. Print the average monthly reading taken from the computeAverage method.
        8. Print the average monthly payment.
        9. Print the month with the lowest water consumption taken from the findLowest method.
        10. Show the month with the highest water consumption taken from the findHighest method.
        11. Print footer.

     */
    public static void showSummary(String n, char t, int[] previous, int[] present, int[] c,
                                   double[] amount){
        System.out.println();
        System.out.println("Annual Water Bill Summary");
        System.out.println("Name of Consumer: " + n);
        System.out.print("Type of consumer: ");
        if (Character.toLowerCase(t) == 'r')
            System.out.println("Residential");
        if (Character.toLowerCase(t) == 'c')

            System.out.println("Commercial");
        System.out.println("Meter reading at the beginning of year = " + previous[0] + " cubic meters");
                System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------",
                        "--------------------");
                        System.out.printf("%15s%15s%15s%20s%n", "Month", "End Reading", "Consumption", "Amount " +
                                "Paid");
                                System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "----------" +
                                        "-----", "--------------------");
        for (int index=0; index < previous.length; index++){
            System.out.printf("%15s%15d%15d%20.2f%n", monthInWord(index+1),
                    present[index],c[index] , amount[index]);
        }
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "----------" +
                "-----", "--------------------");
                System.out.println("Average Monthly Reading = "+ computeAverage(c));
        System.out.println("Average Monthly Payment = "+ computeAverage(amount));
        System.out.println("Month with Lowest Water Consumption = "+ monthInWord((findLowest(c)
                + 1)));
        System.out.println("Month with Highest Water Consumption = "+
                monthInWord((findHighest(c) + 1)));
        System.out.printf("%15s%15s%15s%20s%n", "---------------", "--------------", "---------------", "--------------------");
        return;
    }

    // REQUIRED: Show the algorithm through a multiline comment
    /*
        Algorithm:
        1. monthInWord method is called from the showSummary method.
        2. Using a switch-case statement, string r is returned according to the value of m.
        3. Using a for loop from the showSummary, each month is printed with int m taken from
           index + 1.

     */
    public static String monthInWord(int m){
        String r="";
        switch ( m ){
            case 1 : r = "January";
                break;
            case 2 : r = "February";
                break;
            case 3 : r = "March";
                break;
            case 4 : r = "April";
                break;
            case 5 : r = "May";
                break;
            case 6 : r = "June";
                break;
            case 7 : r = "July";
                break;
            case 8 : r = "August";
                break;
            case 9 : r = "September";
                break;
            case 10 : r = "October";
                break;
            case 11 : r = "November";
                break;
            case 12 : r = "December";
        } // end of switch
        return r;
    } // end of monthInWord method

    //REQUIRED: Provide the algorithm and the code
    /*
        Algorithm:
        1. Void method showIntroduction is called from the main method.
        2. Print the Introduction to be shown at the start of the program.

     */

    public static void showIntroduction(){
        // REQUIRED: Provide the code
        System.out.println("Welcome to the water billing system! The Annual Summary Generator. ");
        System.out.println("=================================================================");
        System.out.println("""
                This program summarizes your water bill according to your consumer type
                together with the month with the highest water consumption and the lowest consumption,
                average monthly reading, and your average monthly payment.""");
        System.out.println("=================================================================");

        return;
    }

    // REQUIRED: Provide the algorithm and provide missing statements to complete the code
    /*
    Algorithm:
    1. Inside a do-while statement, ask the user to input the meter reading at the beginning of the year.
    2. If the user did not entered a number, the user is prompted to enter a number. This
       is done using a try catch statements that if there is a NumberFormatException, the user
       is prompted again.
    3. If the user entered a number less than 0, the user is prompted to enter a number that is
       not less than 0.
    4. The do-while statement will only terminate id the user entered the correct values.
     */
    public static int readStartReading(){
        /* REQUIRED: Declare local variables */
        boolean problemFlag;
        int reading = 0;
        do {
            Scanner scanner = new Scanner (System.in);

            problemFlag = false;
            try {
                System.out.print("Enter the meter reading at the beginning of the year: ");
                reading = Integer.parseInt(scanner.nextLine());
                // REQUIRED: Provide the input statement
            } catch (NumberFormatException x){
                problemFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < 0){
                System.out.println("The beginning meter reading cannot be negative.");
            }
        } while (reading < 0 || problemFlag);
        return reading;
    }

    // REQUIRED: Provide the algorithm and provide the missing statements to complete the code
    public static int readEndOfMonthReading(int start, int month){
        /*REQUIRED: Declare local variables */
        /*
        Algorithm:
        1. readEndOfMonthReading method is a do-while statement.
        2. Ask the user to enter the meter reading for each month of the year.
        3. Using a try catch statement, prompt the user if the exception
           NumberFormatException is triggered to only enter a number and set
           pFLag to true.
        4. Using an if statement, prompt the user to enter a value greater than the previous
           reading if they entered a value lower than the previous reading.
        5. The do-while statement will run while the previous reading is less than the current
           reading or if pFlag is true.
        6. Return the value of the reading that the user entered.
         */
        boolean pFlag;
        int reading = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                pFlag = false;
                System.out.print("Enter the meter reading for month " + monthInWord(month) + ":");
                reading = Integer.parseInt(scanner.nextLine());
                //REQUIRED: Provide the necessary input statement
            } catch (NumberFormatException x){
                pFlag = true;
                System.out.println("You have to enter a number.");
            }
            if (reading < start){
                System.out.println("Invalid datum entry! The present reading must be greater " +
                        "than the previous reading.");
            }
        } while (reading < start || pFlag);
        return reading;
    }
    // REQUIRED: Provide the algorithm and provide the missing statements to complete the code
    /*
    Algorithm:
    1. This method utilizes the do while statement.
    2. Ask the user to enter the type of consumer.
    3. Using an if statement, prompt the user to enter only r for residential
       and c for commercial if they entered the wrong input.
    4. The do-while statement will run while the user did not enter the characters
       R, r, C, or c.
    5. Return the consumer type entered by the user.
     */
    public static char readTypeOfConsumer(){
        /*REQUIRED: Declare local variables */
        Scanner scanner = new Scanner(System.in);
        char t;
        do {
            System.out.print("Enter the type of the consumer< you may type r for residential or " +
                    "c for commercial>: ");
            t = scanner.next().charAt(0);
            //REQUIRED: Provide needed statement(s)
            if (t != 'r' && t !='R' && t != 'c' && t != 'C'){
                System.out.println("The valid types are r for residential and c for " +
                        "commercial.");
            }
        } while (t != 'r' && t !='R' && t != 'c' && t != 'C');
        return t;
    }

    // REQUIRED: Show the algorithm through a multiline comment
    /*
    Algorithm:
    1. computeAmountDue is called from the main method taking in values.
    2. Determine how to calculate the user's consumption by their consumer type.
    3. If the consumer type is residential and if their consumption is less than the minimum bill,
       then the amount due is equal to the minimum bill 180 and the amount is returned. If the user's
       consumption is more than the minimum bill, the amount is computed by 180.00 + (consumption –
       12)*30.00
    4. If the consumer type is commercial and consumption is <= 30, the amount due is 600.00 and
       the amount is returned. If consumer type is commercial and consumption is > 30, the amount due is 600.00 + (consumption –
       30)*50.00 and the amount is returned.
    5. The value is stored in an array.
     */
    public static double computeAmountDue(int c, char t, int min1, double minB1, int min2,
                                          double minB2, float rate1, float rate2){
        double amount = 0;
        switch (t){
            case 'r':
            case 'R':
                if ( c <= min1 ) {
                    amount = minB1;
                }
                else {
                    amount = minB1 + (c-min1)*rate1;
                }
                break;
            case 'c':
            case 'C':
                if ( c <= min2 ) {
                    amount = minB2;
                }
                else {
                    amount = minB2 + (c-min2)*rate2;
                }
        }
        return amount;
    }
} // end of class

/* Sample Run of the Program
Welcome to the water billing system! The Annual Summary Generator.
=================================================================
This program summarizes your water bill according to your consumer type
together with the month with the highest water consumption and the lowest consumption,
average monthly reading, and your average monthly payment.
=================================================================
Enter the name of the water consumer: John Doe
Enter the type of the consumer< you may type r for residential or c for commercial>: r
Enter the meter reading at the beginning of the year: 100
Enter the meter reading for month January:0
Invalid datum entry! The present reading must be greater than the previous reading.
Enter the meter reading for month January:123
Enter the meter reading for month February:150
Enter the meter reading for month March:175
Enter the meter reading for month April:206
Enter the meter reading for month May:250
Enter the meter reading for month June:313
Enter the meter reading for month July:353
Enter the meter reading for month August:389
Enter the meter reading for month September:408
Enter the meter reading for month October:452
Enter the meter reading for month November:507
Enter the meter reading for month December:539

Annual Water Bill Summary
Name of Consumer: John Doe
Type of consumer: Residential
Meter reading at the beginning of year = 100 cubic meters
--------------- -------------------------------------------------
          Month    End Reading    Consumption         Amount Paid
--------------- -------------------------------------------------
        January            123             23              510.00
       February            150             27              630.00
          March            175             25              570.00
          April            206             31              750.00
            May            250             44             1140.00
           June            313             63             1710.00
           July            353             40             1020.00
         August            389             36              900.00
      September            408             19              390.00
        October            452             44             1140.00
       November            507             55             1470.00
       December            539             32              780.00
--------------- -------------------------------------------------
Average Monthly Reading = 36.583333333333336
Average Monthly Payment = 917.5
Month with Lowest Water Consumption = September
Month with Highest Water Consumption = June
--------------- -------------------------------------------------

*/
