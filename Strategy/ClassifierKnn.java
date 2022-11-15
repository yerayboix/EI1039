package Strategy;

public class ClassifierKnn implements Strategy {
    Metrica metrica;

    public ClassifierKnn(Metrica metrica) {
        this.metrica = metrica;
    }

    public ClassifierKnn() {
    }

    @Override
    public void execute() {
        if(metrica != null){
            metrica.compute();
        }
        System.out.println("ClassifierKnn executed");
    }
}
