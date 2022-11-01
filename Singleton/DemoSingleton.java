package Singleton;

public class DemoSingleton {
    public static void main(String[] args) {

        //instance 1
        long ti = System.currentTimeMillis();
        System.out.println( "Tiempo inicial: " + ti);
        Singleton instance1 = Singleton.getInstance();
        long tf = System.currentTimeMillis();
        System.out.println( "Tiempo final: " + tf);
        long tt = tf - ti;
        System.out.println("instance1 = " + instance1);
        System.out.println( "Tiempo total: " + tt);

        //instance 2
        ti = System.currentTimeMillis();
        System.out.println( "Tiempo inicial: " + ti);
        Singleton instance2 = Singleton.getInstance();
        tf = System.currentTimeMillis();
        System.out.println( "Tiempo final: " + tf);
        tt = tf - ti;
        System.out.println("instance2 = " + instance2);
        System.out.println( "Tiempo total: " + tt);

        System.out.println("Es intance1 el mismo objeto que instance2? " + (instance1==instance2));
    }
}
