import java.util.*;  // Import the Scanner class and Random class

public class YourChoice {

    public static void main(String[] args) {

        // Use a scanner to get the player input or Rock, Paper, or Scissors

        Scanner console = new Scanner(System.in);

        String userChoice = "";

        // Prompt for User Choice

        System.out.print("Choose Rock, Paper, or Scissors; To end enter Quit: ");
        userChoice = console.next().toLowerCase();

        System.out.println(userChoice); // for testing
    }
}
