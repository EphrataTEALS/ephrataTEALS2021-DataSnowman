//package sampleCode.Parameters;

public class HellosWithParameters {
    public static void main(String[] args) {
        printHellos(5);
        System.out.println("And again");
        printHellos(10);
        //printHellos();
    }

    public static void printHellos(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Hello world");
        }
    }
}
