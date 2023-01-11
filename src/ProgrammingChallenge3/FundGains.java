package ProgrammingChallenge4;
import java.util.*;
public class FundGains
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the amount for your 401k/403b : ");
        boolean incorrect = true;
        double fundsTransfer = 0;
        while (incorrect)
        {
            fundsTransfer = input.nextInt();
            if (fundsTransfer > 19000)
            {
                System.out.println("Maximum current standard is 19000");
            }
            else
            {
                incorrect = false;
            }
        }
        System.out.print("Input the amount of interest in percentages :");
        double percentInterest = input.nextInt();
        double annualEarning = 0;
        double annualTotal = 0;
        double runningTotal = 0;

        Stack yearlyGains = new Stack();

        for(int i=0; i<30; i++)
        {
            annualEarning = fundsTransfer + annualEarning;
            annualTotal = annualEarning * percentInterest / 100;
            runningTotal = annualTotal + runningTotal;
            yearlyGains.push(runningTotal);
        }

        System.out.println("Total revenue is : " + annualTotal);
        System.out.println("The yearly stack is : " + yearlyGains);
    }
}
