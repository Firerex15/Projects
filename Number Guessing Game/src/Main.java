/**
 * Number Guessing Game
 * •	Description: Generate a random number (1-100), let the user guess it, and provide hints (e.g., “Too high” or “Too low”) until they get it right. Display the number of attempts.
 * •	Skills: Loops (while), conditionals, random number generation, user input.
 * •	Why: Introduces loops and interactive programs, a step up in complexity.
 */
//Imports
import java.util.*;
import java.util.Random; //Random generator import

public class Main
{
    public static void main(String[] args)
    {
        //Variables
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); //Creates random object
        int num = 0;
        boolean validInput = false;
        boolean repeat = true;
        boolean correct = false;

        //Loop keeps running until user chooses to leave game
        while (repeat)
        {
            //Intro + generates new random number for each game session
            System.out.println("\nNumber Guessing Game");
            System.out.println("-------------------------");
            int randomNumber = rand.nextInt(100)+1; //Generates random number from 1-100

            //Loops until user enters the correct number
            while (!validInput || !correct)
            {
                try
                {
                    System.out.print("Enter a number between 1 and 100: ");
                    num = input.nextInt();

                    if(num <= 100 && num >= 1)
                    {
                        validInput = true;
                        if(num == randomNumber)
                        {
                            System.out.println("You guessed the correct number!\n");
                            correct = true;
                        }
                        else if(num < randomNumber)
                        {
                            System.out.println("incorrect guess! - the number is higher!\n");
                        } else if (num > randomNumber)
                        {
                            System.out.println("incorrect guess! - the number is lower!\n");
                        }
                    }
                    else
                    {
                        System.out.println("Error...Invalid Input\n");
                        validInput = false;

                    }



                }
                catch (InputMismatchException e)
                {
                    System.out.println("Error...Invalid Input\n"); //Catches error in case user enters invalid number
                    input.nextLine();
                }


            }

            //Asks user if they would like to play again; loops if yes, ends program if no
            System.out.print("Would you like to play again? (y/n): ");

            System.out.println("");
            if(input.nextLine().equals("y"))
            {
                correct = false;
                validInput = false;

            }
            else if(input.nextLine().equals("n")) {
                repeat = false;
            }

        }

        //Outro
        System.out.println("Good Bye!");
    }
}
