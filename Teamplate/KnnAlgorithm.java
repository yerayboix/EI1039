package Teamplate;

public abstract class KnnAlgorithm {

    public final void executeAlgorithm(){
        lookData();
        calculateDistances();
        findNeighbours();
        voteLabels();
    }


    public abstract void lookData();
    public final void calculateDistances(){
        System.out.println("Calculating distances");
    }
    public final void findNeighbours(){
        System.out.println("Finding Neighbours");
    }
    public abstract void voteLabels();
}
