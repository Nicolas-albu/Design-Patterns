package Java.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton testSingletonOne = Singleton.getInstance();
        Singleton testSingletonTwo = Singleton.getInstance();

        System.out.println(String.format("1° Singleton: %s", testSingletonOne));
        System.out.println(String.format("2° Singleton: %s", testSingletonTwo));
        System.out.println(String.format("1° == 2°: %s", (testSingletonOne == testSingletonTwo) ));
    }
}
