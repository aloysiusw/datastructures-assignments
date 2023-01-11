package ProgrammingChallenge8;
import java.util.*;
public class CountByTen
{
    public static int jumpAmount = 10;

    static void p(int baseNum)
    {
        System.out.println("The next number is " + baseNum);
        baseNum = baseNum + jumpAmount;
        p(baseNum);
    }

    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your starting number: ");
        int startingNum = input.nextInt();
        p(startingNum);
    }
}
