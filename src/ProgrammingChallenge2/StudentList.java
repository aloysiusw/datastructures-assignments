import java.util.*;
public class StudentList
{
    public static void main (String[]args)
    {
        LinkedList<String> listofStudents = new LinkedList<String>();
        Scanner input = new Scanner(System.in);

        listofStudents.add("John");
        listofStudents.add("David");
        listofStudents.add("Paul");
        listofStudents.add("Sarah");
        listofStudents.add("Steven");
        listofStudents.add("Felicia");
        listofStudents.add("Raven");
        listofStudents.add("Simon");

        System.out.println("Current student list:");
        System.out.println(listofStudents);
        System.out.println ("Would you like to add, remove, or replace from this list? (add/remove)");
        String answer1 = input.next();
        if(answer1.equalsIgnoreCase("add"))
        {
            System.out.println("You have selected: " + answer1);
            System.out.println("Input the name here: ");
            String nameInput = input.next();
            System.out.println("Would you like to add in the first entry or last? (first/last)");
            String answer2 = input.next();
            if(answer2.equalsIgnoreCase("first"))
            {
                listofStudents.addFirst(nameInput);
                System.out.println("Current student list:");
                System.out.println(listofStudents);
            }
            else if(answer2.equalsIgnoreCase("last"))
            {
                listofStudents.addLast(nameInput);
                System.out.println("Current student list:");
                System.out.println(listofStudents);
            }
            else
            {
                System.out.println("Invalid input.");
            }
        }
        else if(answer1.equalsIgnoreCase("remove"))
        {
            System.out.println("You have selected: " + answer1);
            System.out.println("Which name in the order would you like to remove?: ");
            int nameOrder = input.nextInt();
            int nameInIndex = nameOrder - 1;
            String selectedName = listofStudents.get(nameInIndex);
            System.out.println("You've selected : " + selectedName);
            System.out.println("Would you like to replace the name?(y/n)");
            String answer3 = input.next();
            if (answer3.equalsIgnoreCase("y"))
            {
                System.out.println("Input the name here: ");
                String nameInput = input.next();
                listofStudents.set(nameInIndex, nameInput);
                System.out.println("Current student list:");
                System.out.println(listofStudents);
            }
            else if (answer3.equalsIgnoreCase("n"))
            {
                listofStudents.remove(nameInIndex);
                System.out.println("Current student list:");
                System.out.println(listofStudents);
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
