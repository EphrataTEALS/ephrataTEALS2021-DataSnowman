package sampleCode.Parameters;

import java.util.Scanner;

public class HellosRuntime {
    
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number = 5;

        while(number != -1){ //while loop

        System.out.print("Enter a Number; To end enter -1: ");
        number = console.nextInt();
        printHellos(number);

        } // end of while loop
    }

    public static void printHellos(int numberOfHellos) {
        for (int i = 0; i < numberOfHellos; i++) {
            System.out.println("Hello world");
        }
    }
}
