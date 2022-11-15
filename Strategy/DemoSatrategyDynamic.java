package Strategy;

public class DemoSatrategyDynamic {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance ---");
        ContextSimple context = new ContextSimple(new ClassifierKnn("Euclidean"));
        context.run();

        System.out.println("--- KNN with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKnn("Manhattan"));
        context.run();

        System.out.println("--- K-means with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierKmeans("Euclidean"));
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeans("Manhattan"));
        context.run();

        System.out.println("--- SOM with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOM("Euclidean"));
        context.run();

        System.out.println("--- SOM with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierSOM("Manhattan"));
        context.run();

    }
}
