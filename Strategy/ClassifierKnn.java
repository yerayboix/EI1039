package Strategy;

public class ClassifierKnn implements Strategy {
    String metrica;

    public ClassifierKnn(String metrica) {
        this.metrica = metrica;
    }

    @Override
    public void execute() {
        if(metrica != null){
            System.out.println(metrica+" computed");
        }
        System.out.println("ClassifierKnn executed");
    }
}
