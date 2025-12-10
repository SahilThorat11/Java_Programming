import java.util.Scanner;

class Arithmetic
{
    int countDiff(int iNo)
    {
        int iDigit = 0, iSumEven = 0, iSumOdd = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNo = iNo / 10;
        }

        return iSumEven - iSumOdd;
    }
}

class Program15_5
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.countDiff(iValue);
        
        System.out.println("Difference between Summation of Even and odd digits are : " + iRet);
    }
}