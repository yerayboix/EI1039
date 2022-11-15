package Strategy;

public class ClassifierSOM implements Strategy {
    String metrica;

    public ClassifierSOM(String metrica) {
        this.metrica = metrica;
    }

    @Override
    public void execute() {
        if(metrica != null){
            System.out.println(metrica+" computed");
        }
        System.out.println("ClassifierSOM executed");
    }
}
