import java.lang.*;
import java.util.*;

/**
 * Algorithm:
 *
 * 1. The reference class is used by the main method to access, print, and populate the Song class
 * 2. The main method will initialize the object of the reference class
 * 3. The user will populate the object of the Song class
 * 4. The data will be sorted using the bubble sort algorithm
 * 5. The data will be printed accordingly
 *
 */
public class SongList {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            SongList myProgram;
            myProgram = new SongList();
            myProgram.run();

        }catch(Exception x){
            x.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * This method will initialize an array to be populated by the user.
     * It will also call necessary methods needed in the program
     */
    public void run(){
        System.out.println("===============================");
        System.out.println("+          Song List          +");
        System.out.println("===============================");
        System.out.println();
        System.out.print("Please enter the number of songs to be listed: ");
        int number = Integer.parseInt(kbd.nextLine());

        Song [] list = new Song[number];


        for (int x = 0; x < number; x++){
            System.out.println();
            System.out.println("Please enter the details of song "+(x+1));
            list[x] = readSong(list);

        }
        System.out.println("Unsorted List: ");
        System.out.println("==================");
        showSongList(list);

        System.out.println();
        System.out.println("Sorted list" );
        System.out.println("==================");
        sortSongList(list);
        showSongList(list);



    }

    /**
     * This method will create a new object of Song
     * @param list
     * @return
     */
    private Song readSong(Song[] list){
        System.out.print("Please enter the title of the song: ");
        String title = kbd.nextLine();
        System.out.print("Please enter the name of the artist: ");
        String artistName = kbd.nextLine();
        System.out.print("Please enter the size of the song in kilobytes: ");
        int size = Integer.parseInt(kbd.nextLine());

        Song s = new Song (title, artistName, size);
        return s;
    }

    /**
     * This method will print the list created
     * @param list
     */
    private void showSongList(Song[]list){
        for(int x = 0; x < list.length; x++){
            System.out.println(list[x].toString());
        }
    }

    /**
     * This method utilizes the bubble sort algorithm in order to sort the given data
     * @param list
     */
    private void sortSongList(Song[]list){
        for(int x = 0; x < list.length - 1; x++){
            int minIndex = x;

            for(int y = x + 1; y < list.length; y++){
                if(list[minIndex].getTitleOfSong().compareToIgnoreCase(list[y].getTitleOfSong()) > 0){
                    minIndex = y;
                }
            }

            if(minIndex!=x){
                Song temp = list[x];
                list[x] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

}

/**
 * Sample run:
 ===============================
 +          Song List          +
 ===============================

 Please enter the number of songs to be listed: 5

 Please enter the details of song 1
 Please enter the title of the song: Misty
 Please enter the name of the artist: Ella Fitzgerald
 Please enter the size of the song in kilobytes: 43124

 Please enter the details of song 2
 Please enter the title of the song: Promise
 Please enter the name of the artist: Laufey Lin
 Please enter the size of the song in kilobytes: 15441

 Please enter the details of song 3
 Please enter the title of the song: Stardust
 Please enter the name of the artist: Nat Cole King
 Please enter the size of the song in kilobytes: 252

 Please enter the details of song 4
 Please enter the title of the song: Solitude
 Please enter the name of the artist: Billie Holiday
 Please enter the size of the song in kilobytes: 2242

 Please enter the details of song 5
 Please enter the title of the song: Round Midnight
 Please enter the name of the artist: Samara Joy
 Please enter the size of the song in kilobytes: 1414
 Unsorted List:
 ==================
 Misty, Ella Fitzgerald, 43124 kilobytes
 Promise, Laufey Lin, 15441 kilobytes
 Stardust, Nat Cole King, 252 kilobytes
 Solitude, Billie Holiday, 2242 kilobytes
 Round Midnight, Samara Joy, 1414 kilobytes

 Sorted list
 ==================
 Misty, Ella Fitzgerald, 43124 kilobytes
 Promise, Laufey Lin, 15441 kilobytes
 Round Midnight, Samara Joy, 1414 kilobytes
 Solitude, Billie Holiday, 2242 kilobytes
 Stardust, Nat Cole King, 252 kilobytes

 Process finished with exit code 0
 */
