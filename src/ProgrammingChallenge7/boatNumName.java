package ProgrammingChallenge7;
import java.util.*;
public class boatNumName
{
    public static void main (String[]args)
    {
        Hashtable<String, String> boatIdentity = new Hashtable<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many boats to input: ");
        int boatAmount = input.nextInt();
        String boatName;
        String boatID;
        for(int i=0; i<boatAmount; i++)
        {
            System.out.print("Input boat name: ");
            boatName = input.next();
            System.out.println();
            System.out.print("Input boat hull number: ");
            boatID = input.next();
            boatIdentity.put(boatName, boatID);
        }
        System.out.println();
        System.out.println("Check boat name/value/table? (name/value/all)");
        String answer = input.next();
        if (answer.equalsIgnoreCase("name"))
        {
            System.out.println("Input the boat name to be checked: ");
            String answerInside = input.next();
            System.out.println("Data contains the boat " + answerInside + ": " + boatIdentity.containsKey(answerInside));
        }
        else if (answer.equalsIgnoreCase("value"))
        {
            System.out.println("Input the boat name to be checked: ");
            String answerInside = input.next();
            System.out.println("Data contains the boat " + answerInside + ": " + boatIdentity.containsValue(answerInside));
        }
        else if (answer.equalsIgnoreCase("all"))
        {
            System.out.println(boatIdentity);
        }
        else
        {
            System.out.println("Invalid input.");
        }
    }

}
