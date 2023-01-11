package Exam1;
import java.util.*;
public class QuestionFourth
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        LinkedList<String> exam4ST = new LinkedList<>();
        System.out.println("Input the stuff: ");
        for(int i=0; i<4; i++)
        {
            String stackInput = input.next();
            exam4ST.addFirst(stackInput);
        }
        System.out.println(exam4ST);
    }
}
