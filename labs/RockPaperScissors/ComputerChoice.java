import java.util.*;  // Import the Scanner class and Random class

public class ComputerChoice {

    public static void main(String[] args) {

        // Use Random class for the computers choice
        Random computer = new Random();
        double computerChoice = computer.nextDouble();
        String computerChoiceString = "";

        // Use If Else logic for the computer to chose based on the Random number

        System.out.println(computerChoice); // for testing

        if (computerChoice < 0.34) {
            computerChoiceString = "rock";
        } else if(computerChoice <= 0.67) {
            computerChoiceString = "paper";
        } else {
            computerChoiceString = "scissors";
        }

        System.out.println(computerChoiceString); // for testing
        

    }
    
}