package Composite;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayList implements Play {
    String playListName;
    ArrayList<PlayList> playLists;
    ArrayList<Song> songs;

    public PlayList(String playListName) {
        this.playListName = playListName;
        this.playLists = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public String getPlayListName() {
        return playListName;
    }

    public void add(Song s){
        songs.add(s);
    }


    public void add(PlayList newPlayList) {
        playLists.add(newPlayList);
    }

     @Override
    public void playSongs(){
        for (Song s : songs){
            System.out.println("-----"+getPlayListName()+"-----");
            System.out.println(s.formatArtistName());
        }
    }

    public void play() {
        if(playLists.size() != 0){
            for(PlayList p: playLists){
                System.out.println("-----"+getPlayListName()+"-----");
                p.playSongs();
            }
        }
        playSongs();
    }
}
