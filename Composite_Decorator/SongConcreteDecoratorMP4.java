package Composite_Decorator;

public class SongConcreteDecoratorMP4 extends SongDecorator {

    public SongConcreteDecoratorMP4(PlayComponent c) {
        super(c);
    }

    @Override
    public void play(){
        super.play();
        System.out.println("ON MP4");
    }
}
