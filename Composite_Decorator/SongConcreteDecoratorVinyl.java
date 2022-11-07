package Composite_Decorator;

public class SongConcreteDecoratorVinyl extends SongDecorator{

    public SongConcreteDecoratorVinyl(PlayComponent c) {
        super(c);
    }

    @Override
    public void play(){
        super.play();
        System.out.println("ON vinyl");
    }
}
