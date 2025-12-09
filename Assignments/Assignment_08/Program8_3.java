import java.util.Scanner;

class Arithematic
{
    int Factorial(int iNo)
    {
        int iCnt = 0, iFact = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1, iFact = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
}

class Program8_3
{
    public static void main(String A[])
    {
        int iRet = 0, iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        iRet = aobj.Factorial(iValue);

        System.out.println("Factorial of given number is : " + iRet);
    }
}