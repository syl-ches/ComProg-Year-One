package exercises.prelims;
import java.util.Scanner;
public class Dispenser {
    // use module
    public static void main(String[] args) {
        Scanner machine = new Scanner (System.in);

        System.out.println(" Enter amount to be withdrawn, whole numbers only: ");
        int amount;
        amount = Integer.parseInt(machine.nextLine());

        int largest = 1000;
        int mid = 500;
        int small = 100;

        int biggest = (amount / largest);
        int remain = biggest * largest;
        int minus = amount - remain;


        int mon = biggest*largest;

        int divide = amount - mon;
        int mean =  divide / mid;
        int wastes = mean * mid;
        int more = minus - wastes;

        double mone = mean * mid;

        int kind = more / small;
        int wasted = kind * small;
        int smallest = wasted - more;

        double bills = biggest + mean + kind;

        System.out.println(" PESO BILLS           QUANTITY DISPENSED          AMOUNT ");
        System.out.println("============         ====================        ========");
        System.out.println(""+largest+"                   "+biggest+"                          "+mon+"");
        System.out.println(""+mid+"                     "+mean+"                         "+mone+"");
        System.out.println(""+small+"                     "+kind+"                           "+wasted+"");
        System.out.println("------------         --------------------        --------");
        System.out.println("Total number of bills        "+bills+"         "+amount+"");


    }
}
