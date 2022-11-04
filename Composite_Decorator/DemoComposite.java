package Composite_Decorator;

public class DemoComposite {
    public static void main(String[] args) {
        // Make "Sabina's hits" playlist and add 2 songs to it
        PlayComponentList sabinaPlaylist = new PlayComponentList("Sabina's hits");
        sabinaPlaylist.add(new SongVinyl("Princesa", "Joaquín Sabina"));
        sabinaPlaylist.add(new SongMP4("Calle melancolía", "Joaquín Sabina"));
        // Make "Manolo García's hits" playlist and add 3 song to it
        PlayComponentList garciaPlaylist = new PlayComponentList("Manolo Garcia's hits");
        garciaPlaylist.add(new Song("Pájaros de barro", "Manolo García"));
        garciaPlaylist.add(new Song("Zapatero", "Manolo García"));
        garciaPlaylist.add(new Song("A San Fernando, un ratito a pie y otro caminando", "Manolo García"));
        // Make "my songs" playlist; add the two playlists and one single song
        PlayComponentList mySongs = new PlayComponentList("My Songs");
        mySongs.add(sabinaPlaylist);
        mySongs.add(garciaPlaylist);
        mySongs.add(new Song("Penso positivo", "Lorenzo Jovanotti"));
        // Play all songs of each playlist
        mySongs.play();
    }
}
