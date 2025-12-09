import java.util.Scanner;

class Arithmetic
{
    int FactorialDiff(int iNo)
    {
        int iCnt = 0, iOdd = 0, iEven = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1, iOdd = 1, iEven = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                iOdd = iOdd * iCnt;
            }

            if(iCnt % 2 == 0)
            {
                iEven = iEven * iCnt;
            }
        }

        return iEven - iOdd;
    }
}

class Program9_5
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.FactorialDiff(iValue);

        System.out.print("Difference between Odd and Even factorial is : " + iRet);
    }
}