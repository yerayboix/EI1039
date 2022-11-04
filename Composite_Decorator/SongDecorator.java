package Composite_Decorator;

public class SongDecorator implements PlayComponent {
    String support;

    PlayComponent c;

    public SongDecorator(PlayComponent c, String support) {
        this.c = c;
        this.support = support;
    }

    @Override
    public void play(){
        c.play();
        System.out.println("ON "+support);
    }
}
