/**
 * ******************************Pseudocode*************************
 * input: yes or no
 * output: Welcome user
 *         two random numbers between 1 and 6
 *         score
 *         user response
 *         message when game is over after score is over 100
 * process: import Random and Scanner class
 *          create Random object
 *          create Scanner object
 *          prompt user for beginning of the game
 *          declare a String variable to store user input
 *          accept input
 *          declare score int variable and initialize to 0
 *          start a while loop
 *              condition = user input is "yes"
 *              declare two int random number variables and assign them to 1 + random generator bound to 6
 *
 *              //compute score Amount with if statement
 *              if random number 1 and 2 are equal to 1 then add 25 to score
 *              else if only one of the random number is 1 then add 0 to score
 *              else add the sum of the 2 random numbers to score
 *
 *              print the result to the console
 *
 *              if score is greater than or equal to 100
 *                  prompt user they have scored enough and break out of while loop
 *
 *              accept user response
 *         end while
 *
 *         print "Thank you for playing!" to console
 *
 *********************************Test Case**************************
 * case 1
 * Welcome! Let's Play Roll Dice! enter yes or no to play
 * yes
 * Your rolls 2 & 1
 * Score: 0
 * Roll again? yes
 * yes
 * Your rolls 5 & 3
 * Score: 8
 * Roll again? yes
 * yes
 * Your rolls 1 & 4
 * Score: 8
 * Roll again? yes
 * no
 * Thank you for playing!
 *
 * Process finished with exit code 0
 *
 * case 2
 * Welcome! Let's Play Roll Dice! enter yes or no to play
 * yes
 * Your rolls 6 & 5
 * Score: 11
 * Roll again? yes
 * yes
 * Your rolls 2 & 4
 * Score: 17
 * Roll again? yes
 * yes
 * Your rolls 2 & 5
 * Score: 24
 * Roll again? yes
 * yes
 * Your rolls 6 & 1
 * Score: 24
 * Roll again? yes
 * yes
 * Your rolls 3 & 1
 * Score: 24
 * Roll again? yes
 * yes
 * Your rolls 3 & 5
 * Score: 32
 * Roll again? yes
 * yes
 * Your rolls 4 & 2
 * Score: 38
 * Roll again? yes
 * yes
 * Your rolls 2 & 5
 * Score: 45
 * Roll again? yes
 * yes
 * Your rolls 3 & 3
 * Score: 51
 * Roll again? yes
 * yes
 * Your rolls 5 & 4
 * Score: 60
 * Roll again? yes
 * yes
 * Your rolls 6 & 1
 * Score: 60
 * Roll again? yes
 * yes
 * Your rolls 1 & 3
 * Score: 60
 * Roll again? yes
 * yes
 * Your rolls 2 & 5
 * Score: 67
 * Roll again? yes
 * yes
 * Your rolls 5 & 3
 * Score: 75
 * Roll again? yes
 * yes
 * Your rolls 2 & 2
 * Score: 79
 * Roll again? yes
 * yes
 * Your rolls 6 & 4
 * Score: 89
 * Roll again? yes
 * yes
 * Your rolls 1 & 3
 * Score: 89
 * Roll again? yes
 * yes
 * Your rolls 5 & 3
 * Score: 97
 * Roll again? yes
 * yes
 * Your rolls 2 & 4
 * Score: 103
 * Roll again? yes
 *
 * You have scored over 100
 * Thank you for playing!
 *
 * Process finished with exit code 0
 *
 */



import java.util.Random;
import java.util.Scanner;

public class GameOfDice {
    public static void main(String [] args) {

        // create random number generator
        Random r = new Random();

        //create scanner object
        Scanner input = new Scanner(System.in);
        // prompt user
        System.out.println("Welcome! Let's Play Roll Dice! enter yes or no to play");
        String yesOrNo = input.nextLine();

        int score = 0;

        while (yesOrNo.equals("yes")) {
            // generate two int random numbers 1 to 6
            int randomNum1 = 1 + r.nextInt(6);
            int randomNum2 = 1 + r.nextInt(6);


            // compute the score
            if (randomNum1 == 1 && randomNum2 == 1) score += 25;
            else if ((randomNum1 == 1 && randomNum2 != 1) || (randomNum1 != 1 && randomNum2 == 1))
                score += 0;
            else score += (randomNum1 + randomNum2);

            System.out.println("Your rolls " + randomNum1 + " & " + randomNum2 + "\nScore: " + score + "\nRoll again? " + yesOrNo);


            if (score >= 100) {
                System.out.println("\nYou have scored over 100");
                break;
            }
            yesOrNo = input.nextLine();
        }
        System.out.println("Thank you for playing!");
    }
}
