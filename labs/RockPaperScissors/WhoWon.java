public class WhoWon {

    public static void main(String[] args) {
 
     String choice1 = "rock";
     String choice2 = "rock";
 
     if(choice1.equals(choice2)){
         System.out.println(" -- The result is a tie!");
     }
     else if(choice1.equals("rock") && choice2.equals("scissors")){
         System.out.println(" -- Rock crushes Scissors: You win!");
     }
     else {
         System.out.println("Quit or Error in Logic so Trouble Shoot");
     }
 
     /*
     if(choice1.equals(choice2)){
         return  x + " -- The result is a tie!";
     }
     else if(choice1.equals("rock") && choice2.equals("scissors")){
         return x + " -- Rock crushes Scissors: You win!";
     }
     */
 
        
    }
     
 }