/**
 * Grade Calculator
 * --------------------
 * The goal of this program is to determine the grade of the
 * user.
 *
 * Ask the user for a test score (0-100) and print a letter grade
 * (A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: below 60).
 */
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Variables
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        int grade = 0;
        char letter;

        //Intro
        System.out.println("GRADE CALCULATOR");
        System.out.println("------------------------");

        while(!validInput)
        {
            try
            {
                System.out.print("Enter Your Grade: ");
                grade = input.nextInt();

                if (grade >= 0 && grade <= 100)
                {
                    validInput = true;
                }
                else
                {
                    System.out.println("Invalid Grade\n");
                    validInput = false;
                }


            }
            catch(InputMismatchException e) {
                System.out.println("Invalid input\n");
                input.nextLine();
            }

        }

        //Grade Calculator
        if(grade>=90)
        {
            letter = 'A';
        }
        else if(grade>=80)
        {
            letter = 'B';
        }
        else if(grade>=70)
        {
            letter = 'C';
        }
        else if(grade>=60)
        {
            letter = 'D';
        }
        else
        {
            letter = 'F';
        }

        //Final Output
        System.out.println("Your grade is: " + letter);


    }
}
