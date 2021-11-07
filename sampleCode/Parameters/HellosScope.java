package sampleCode.Parameters;

public class HellosScope {
    public static void main(String[] args) {
        int numberOfHellos;

        numberOfHellos = 5;
        printHellos();

        numberOfHellos = 10;
        printHellos();
    }

    public static void printHellos() {
        for (int i = 0; i < numberOfHellos; i++) {
            System.out.println("Hello world");
        }
    }
}
