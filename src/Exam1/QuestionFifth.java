import java.util.*;
public class QuestionFifth
{
    public static void main(String[]args)
    {
        Queue<Double> exam5Q;
        exam5Q = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input the amount of numbers: ");
        double numAmt = input.nextDouble();
        System.out.println("Input your numbers");
        for (double i=0; i<numAmt; i++)
        {
            exam5Q.add(input.nextDouble());
        }
        System.out.print("Input your exponent: ");
        double expoValue = input.nextInt();
        while (!exam5Q.isEmpty())
        {
            double exam5Qdbl = exam5Q.poll();
            System.out.println(Math.pow(exam5Qdbl, expoValue));
        }
    }
}