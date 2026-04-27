import java.util.*;

public class Program06
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int iNo = sobj.nextInt();

        boolean isPrime = true;

        if (iNo <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            for (int i = 2; i <= Math.sqrt(iNo); i++) 
            {
                if (iNo % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime == true)
        {
            System.out.println(iNo + " is Prime number");
        }
        else
        {
            System.out.println(iNo + " is Not a prime number");
        }
    }
}