package Strategy;

public class ClassifierSOM implements Strategy {
    Metrica metrica;

    public ClassifierSOM(Metrica metrica) {
        this.metrica = metrica;
    }

    public ClassifierSOM() {
    }


    @Override
    public void execute() {
        if(metrica != null){
            metrica.compute();
        }
        System.out.println("ClassifierSOM executed");
    }

}
