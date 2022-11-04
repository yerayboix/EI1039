package Composite_Decorator;

public class SongMP4 extends Song {
    String support = "MP4";

    public SongMP4(String name, String artist) {
        super(name, artist);
    }

    @Override
    public void play(){
        System.out.println("Escuchando..."+getName()+" BY "+getArtist());
        System.out.println("ON "+support);
    }
}
