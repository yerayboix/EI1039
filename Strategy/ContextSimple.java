package Strategy;

public class ContextSimple{
    Strategy classifier;
    public ContextSimple(Strategy classifier) {
        this.classifier = classifier;
    }

    public void setClassifierStrategy(Strategy classifier) {
        this.classifier = classifier;
    }

    public void run() {
        classifier.execute();
    }
}
