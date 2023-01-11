import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class DataStructuresMidReview
{
    private void arrayListReview()
    {
        ArrayList<String> arrayDemo = new ArrayList<String>(); //instantiate a new array list object

        System.out.println("Array list has the advantage of being faster to parse, but slower to modify");

        arrayDemo.add("Jan");
        arrayDemo.add("Alexis");
        arrayDemo.add("Bjorn");

        System.out.println(arrayDemo);
    }
    private void linkedListReview()
    {
        LinkedList<String> linkedListDemo = new LinkedList<String>();

        System.out.println("Linked list has the advantage of being faster to modify, but slower to parse");
        System.out.println("Linked list is also a lot more complex, and thus has more performance hit");

        linkedListDemo.add("Matt");
        linkedListDemo.add("Melinda");
        linkedListDemo.add("Chris");

        System.out.println(linkedListDemo);
    }
    private void stackReview()
    {
        Stack<String> stackDemo = new Stack<>();

        System.out.println("Stack uses the point of view of first things in, last things out");

        stackDemo.push("Beno"); //the data type for a stack will be determined when it is called
        stackDemo.push("Darren");
        stackDemo.push("Said");

        System.out.println(stackDemo);
    }
    private void queueReview()
    {
        Queue<String> queueDemo;
        queueDemo = new LinkedList<String>();

        System.out.println("Queue has the benefit of being a first in, first out system");

        queueDemo.add("Leroy");
        queueDemo.add("Chase");
        queueDemo.add("Aleksei");

        System.out.println(queueDemo);
    }
    public static void main (String[]args)
    {
        DataStructuresMidReview reviewObject = new DataStructuresMidReview();
        boolean mainUnfinished = true;
        while (mainUnfinished)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("A : ArrayList");
            System.out.println("B : LinkedList");
            System.out.println("C : Stack");
            System.out.println("D : Queue");
            System.out.print("Input your selection of demos (A/B/C): ");
            boolean unfinished = true;
            while (unfinished)
            {
                String mainInput = input.next();
                if (mainInput.equalsIgnoreCase("A"))
                {
                    reviewObject.arrayListReview();
                    unfinished = false;
                }
                else if (mainInput.equalsIgnoreCase("B"))
                {
                    reviewObject.linkedListReview();
                    unfinished = false;
                }
                else if (mainInput.equalsIgnoreCase("C"))
                {
                    reviewObject.stackReview();
                    unfinished = false;
                }
                else if (mainInput.equalsIgnoreCase("D"))
                {
                    reviewObject.queueReview();
                    unfinished = false;
                }
				else
                {
                    System.out.println("Invalid input, try again.");
                    System.out.print("Reinput your selection here: ");
                }
            }
            System.out.println("Are you finished? (y/n)");
            boolean inputIncorrect = true;
            while (inputIncorrect)
            {
                String finalInput = input.next();
                if (finalInput.equalsIgnoreCase("y"))
                {
                    mainUnfinished = false;
                    inputIncorrect = false;
                    break;
                }
                else if (finalInput.equalsIgnoreCase("n"))
                {
                    inputIncorrect = false;
                    break;
                }
                else
                {
                    System.out.println("Invalid input, try again:");
                }
            }
        }
    }
}