import java.util.Scanner;

class Arithmetic
{
    int EvenFactorial(int iNo)
    {
        int iCnt = 0, iFact = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1, iFact = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iFact = iFact * iCnt;
            }
        }

        return iFact;
    }
}

class Program9_3
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.EvenFactorial(iValue);

        System.out.print("Even factorial of " + iValue + " is : " + iRet);
    }
}