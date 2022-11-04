package Composite_Decorator;

public class SongVinyl extends Song{
    String support = "vinyl";

    public SongVinyl(String name, String artist) {
        super(name, artist);
    }

    @Override
    public void play(){
        System.out.println("Escuchando..."+getName()+" BY "+getArtist());
        System.out.println("ON "+support);
    }
}
