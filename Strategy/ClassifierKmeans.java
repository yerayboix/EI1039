package Strategy;

public class ClassifierKmeans implements Strategy{
    String metrica;

    public ClassifierKmeans(String metrica) {
        this.metrica = metrica;
    }

    @Override
    public void execute() {
        if(metrica != null){
            System.out.println(metrica+" computed");
        }
        System.out.println("ClassifierKmeans executed");
    }
}
