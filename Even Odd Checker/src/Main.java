/**
 * Even Odd Checker
 * ------------------
 * This program takes an integer number from the user and determines
 * weather the number is either even or odd
 */
//Import Package
import java.util.*;

//Main Class
public class Main
{
    public static void main(String[] args) {
        //Creates a scanner named input
        Scanner input = new Scanner(System.in);

        //Initial Variables
        String checker = "";
        boolean validInput = true;
        int num = 0;

        //While loop that ends if user enters 0
        while (validInput) {
            System.out.print("\nPlease enter a valid integer number (Type 0 to end loop): ");
            try {

                num = input.nextInt();

                //if user enters 0 -> ends program
                if (num == 0) {
                    validInput = false;
                } else {
                    validInput = true; //Continues program
                }

                //Checks if number is even or odd
                if ((num % 2) == 0) {
                    checker = "Even";
                } else {
                    checker = "Odd";
                }

                //Prints result to user
                System.out.println("The integer number is " + checker);

            }
            catch (InputMismatchException e) //If user enters invalid value
            {
                System.out.println("\nThat is not a valid integer number.");
                input.nextLine(); //Clears buffer
            }
        }

        //Outro
        System.out.println("Goodbye!");

    }
}
