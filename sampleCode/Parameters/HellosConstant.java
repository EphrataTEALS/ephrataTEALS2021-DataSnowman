package sampleCode.Parameters;

public class HellosConstant {
    
    public static final int NUMBER = 5;

    public static void main(String[] args) {
        printHellos();
    }

    public static void printHellos() {
        for (int i = 0; i < NUMBER; i++) {
            System.out.println("Hello world");
        }
    }
}
