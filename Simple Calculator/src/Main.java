import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");

        String opp = "";
        int num1 =0;
        int num2 =0;
        double answer =0;

        while (!(opp.equals("no")))
        {
            System.out.print("Enter first number: ");
            num1 = input.nextInt();
            System.out.print("Enter second number: ");
            num2 = input.nextInt();

            System.out.print("Enter the operation: ");
            opp = input.next();


            if(opp.equals("add"))
            {
                answer = num1 + num2;
            }
            else if(opp.equals("subtract"))
            {
                answer = num1 - num2;
            }
            else if(opp.equals("multiply"))
            {
                answer = num1 * num2;
            }
            else if (opp.equals("divide"))
            {
            answer = num1 / num2;
            }
            else
            {
                System.out.println("Invalid input\n");
            }

            System.out.println("The answer is: " + answer + "\n");

            System.out.print("Would you like to continue? (yes/no): ");
            opp = input.next();
        }

        System.out.println("Goodbye!");

    }
}