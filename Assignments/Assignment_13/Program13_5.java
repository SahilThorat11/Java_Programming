import java.util.Scanner;

class Arithmetic
{
    int sumEvenNumbers(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            return 0;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

class Program13_5
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.sumEvenNumbers(iValue);

        System.out.println("Summation of Even numbers are : "+ iRet);
    }
}