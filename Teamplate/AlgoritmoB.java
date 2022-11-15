package Teamplate;

public class AlgoritmoB extends KnnAlgorithm{
    @Override
    public void lookData() {
        System.out.println("Mirando correo");
    }

    @Override
    public void voteLabels() {
        System.out.println("Se trata de un correo de SPAM");
    }
}
