public class Song {

    private String titleOfSong;
    private String artistOfSong;
    private int sizeOfSong;


    public Song(String name, String artist, int size){
        titleOfSong = name;
        artistOfSong = artist;
        sizeOfSong = size;
    }

    public void setTitleOfSong(String name){
        titleOfSong = name;
    }

    public void setArtistOfSong(String artist){
        artistOfSong = artist;
    }

    public void setSizeOfSong(int size){
        sizeOfSong = size;
    }

    public String getTitleOfSong(){
        return titleOfSong;
    }

    public String getArtistOfSong(){
        return artistOfSong;
    }

    public int getSizeOfSong(){
        return sizeOfSong;
    }

    public String toString(){
        return (titleOfSong+", "+artistOfSong+", " +sizeOfSong+" kilobytes");
    }
}
