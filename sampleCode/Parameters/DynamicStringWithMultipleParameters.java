//package sampleCode.Parameters;

public class DynamicStringWithMultipleParameters {
    
    public static void main(String[] args) {
        String x = "I get this!";
        writeStrings(x, 5);
        System.out.println();
        writeStrings("Parameters are Really, Really, Cool", 2);
    
    }

    public static void writeStrings(String caption, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(caption);
        }
    }
}