import java.util.*;
public class LogChallenge
{
    public static void main(String[]args)
    {
        double [] phoneNumber = {20, 30, 40, 50, 60};
        for (double parse : phoneNumber)
        {
            double logResult = (Math.log(parse) / Math.log(5));
            System.out.print(logResult + ", ");
        }
    }
}