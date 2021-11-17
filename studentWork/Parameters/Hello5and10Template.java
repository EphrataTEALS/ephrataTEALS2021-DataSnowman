
//package sampleCode.Parameters;

public class Hello5and10Template {

    public static void main(String[] args) {
        print5Hellos();
        System.out.println("And again");
        print10Hellos();
    }

    public static void print5Hellos() {

        for(int i =1; i<=5; i++){
            System.out.println("Hello world");
        }
        
    }

    public static void print10Hellos() {

        for(int i =1; i<=10; i++){
            System.out.println("Hello world");
        }
    }
    
}