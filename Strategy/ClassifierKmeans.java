package Strategy;

public class ClassifierKmeans implements Strategy{
    Metrica metrica;

    public ClassifierKmeans(Metrica metrica) {
        this.metrica = metrica;
    }

    public ClassifierKmeans() {
    }

    @Override
    public void execute() {
        if(metrica != null){
            metrica.compute();
        }
        System.out.println("ClassifierKmeans executed");
    }

}
