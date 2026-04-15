// Check if a number is prime
import java.util.Scanner;

class Prime
{
    public static boolean isPrime(int iNo)
    {
        if (iNo < 2)
        {
            return false;
        }

        for (int i = 2; i * i <= iNo; i++)
        {
            if (iNo % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}

public class Program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.print("Enter a number: ");
        int iValue = sobj.nextInt();

        Prime pobj = new Prime();

        bRet = pobj.isPrime(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is a Prime number.");
        } 
        else 
        {
            System.out.println(iValue + " is NOT a Prime number.");
        }

        sobj.close();
    }
}