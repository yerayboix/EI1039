package Composite_Decorator;

import java.util.ArrayList;

public class PlayComponentList implements PlayComponent {
    String playListName;
    ArrayList<PlayComponent> components;

    public PlayComponentList(String playListName) {
        this.playListName = playListName;
        this.components = new ArrayList<>();
    }

    public String getPlayListName() {
        return playListName;
    }


    public void add(PlayComponent component) {
        components.add(component);
    }

     @Override
    public void play(){
        for (PlayComponent c : components){
            System.out.println("-----"+getPlayListName()+"-----");
            c.play();
        }
    }
}
