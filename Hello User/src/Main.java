import java.util.*;
//Simport java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        System.out.print("What is your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
