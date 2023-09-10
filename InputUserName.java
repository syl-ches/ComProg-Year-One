import java.util.Scanner;
public class InputUserName {
    //code below asks the user for a username and their block number
    //-and displays them
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        String userName;
        String blockNumber;

        System.out.println("Enter your Username");

        userName = name.nextLine();

        System.out.println("Enter your course and block number");

        blockNumber = name.nextLine();

        System.out.println("Welcome "+userName+" from "+blockNumber+" ");

    }
}
