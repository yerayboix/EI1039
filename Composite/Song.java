package Composite;

public class Song implements PlayComponent{
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

    @Override
    public void play() {
        System.out.println("Escuchando..."+getName()+" BY "+getArtist());
    }
}
