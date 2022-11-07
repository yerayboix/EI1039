package Composite_Decorator;

public class SongDecorator implements PlayComponent {

    PlayComponent c;

    public SongDecorator(PlayComponent c) {
        this.c = c;
    }

    @Override
    public void play(){
        c.play();

    }
}
