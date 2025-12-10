import java.util.Scanner;

class Arithmetic
{
    boolean isDivisibleBYFive(int iNo)
    {
        if(iNo % 5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program12_5
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        bRet = aobj.isDivisibleBYFive(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is Divisible by 5");
        }
        else
        {
            System.out.println(iValue + " is Not Divisible by 5");
        }
    }
}