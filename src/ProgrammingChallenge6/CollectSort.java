package ProgrammingChallenge6;
import java.util.Scanner;
public class CollectSort
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int collectArray[] = new int[5];
        System.out.println("Input your numbers here: ");
        for(int i=0; i<5; i++)
        {
            int collectInput = input.nextInt();
            collectArray[i] = collectInput;
        }
        int tempValue = 0;
        for(int i=0; i<5; i++)
        {
            for(int j=1; j<(5-i); j++)
            {
                if(collectArray[j-1] > collectArray[j])
                {
                    tempValue = collectArray[j - 1];
                    collectArray[j - 1] = collectArray[j];
                    collectArray[j] = tempValue;
                }
            }
        }
        System.out.println("Sorted numbers: ");
        for(int i=0; i<5; i++)
        {
            System.out.println(collectArray[i]);
        }
    }
}
