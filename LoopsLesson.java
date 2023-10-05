public class LoopsLesson {
    public static void main(String[] args) {

        int n = 10;
        int i = 1;
        /*
        for(int i = 1; i <= n; i++){
             System.out.println(i);
         }

        */

        /*
        while (i <= n){
           System.out.println(i);
           ++i;
         }
        */

        /*
        do {
            System.out.println("Java is fun " + i);
            i++;
        } while(i <= n);
        */

        do {
            System.out.println("This positive number is less than 10 : " +i);
            i++;
        } while(i < 10);
    }
}