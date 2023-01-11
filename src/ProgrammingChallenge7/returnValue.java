package ProgrammingChallenge7;

import java.util.*;

public class returnValue
{
    public static void main (String[]args)
    {
        Hashtable<String, String> studentList = new Hashtable<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many students to input: ");
        int studentAmount = input.nextInt();
        String studentName;
        String studentID;
        for(int i=0; i<studentAmount; i++)
        {
            System.out.print("Input student name: ");
            studentName = input.next();
            System.out.print("Input student ID number: ");
            studentID = input.next();
            studentList.put(studentName, studentID);
            System.out.println();
        }
        boolean unfinished = true;
        while (unfinished)
        {
            System.out.println("Input the student name to retrieve the ID number: ");
            String answerName = input.next();

            System.out.println("Student name is: " + studentList.get(answerName));
            System.out.println("Finished? (y/n)");

            String answerFinish = input.next();

            if (answerFinish.equalsIgnoreCase("y"))
            {
                unfinished = false;
            }
            else
            {
            }
        }
    }
}
