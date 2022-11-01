package Composite;

public class Song {
    String name;
    String artist;
    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String formatArtistName(){
        return "Escuchando..."+this.name+" BY "+this.artist;
    }
}
