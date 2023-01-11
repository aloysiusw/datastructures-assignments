package ProgrammingChallenge4;
import java.util.*;
public class HomeCalculator
{
    public static void main (String[]args)
    {
        Queue<Double> homeQueue;

        homeQueue = new LinkedList<Double>();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input home value: ");
        double homeValue = keyboard.nextInt();
        System.out.print("Input down payment: ");
        double downPayment = keyboard.nextInt();
        double adjustedHomeValue = (homeValue - downPayment);

        System.out.print("Input annual interest rate: ");
        double interestRate = keyboard.nextInt();
        double adjustedInterest = interestRate / 12;
        System.out.println("Adjusted interest per month is " + adjustedInterest + "%");

        System.out.print("Input monthly principle amount: ");
        double monthlyPrinciple = keyboard.nextInt();

        double currentPayment = 0;
        double interestValue = 0;
        for(int i=0; i<12; i++)
        {
            interestValue = adjustedHomeValue * adjustedInterest / 100;
            homeQueue.add(interestValue);
            currentPayment = interestValue + monthlyPrinciple;
            adjustedHomeValue = adjustedHomeValue - currentPayment;
        }

        System.out.println(homeQueue);
    }
}
