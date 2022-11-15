package Strategy;

public class DemoSatrategyDynamic {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance ---");
        ContextSimple context = new ContextSimple(new ClassifierKnn(new Euclidean()));
        context.run();

        System.out.println("--- KNN with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKnn(new Manhattan()));
        context.run();


        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeans(new Manhattan()));
        context.run();

        System.out.println("--- SOM with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOM(new Euclidean()));
        context.run();


    }
}
