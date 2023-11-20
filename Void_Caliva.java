import java.util.Random; // Caliva, Mark Chester P.
public class Void_Caliva {
    public static void main(String[] args){
        sumTotalArray(); // calling the method
    }

    public static void sumTotalArray(){

        Random a = new Random();
        System.out.println("Random Array: ");
        System.out.print("[");
        int sum = 0;
         for(int i = 0; i<10; i++){
             int rand1 = a.nextInt(51); //generates a random number
             int[] b = new int[10]; // array size declaration
             b[i] = rand1; // array value assignment
             sum += b[i];
             System.out.print(" "+b[i]+", ");
         }
            System.out.print("]");
            System.out.println();
            System.out.println("Sum of the total numbers: "+sum);
    }
}
