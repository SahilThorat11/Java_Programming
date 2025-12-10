import java.util.Scanner;

class Arithmetic
{
    int sumNaturalNumbers(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            return 0;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        return iSum;
    }
}

class Program13_4
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.sumNaturalNumbers(iValue);

        System.out.println("Summation of Natural numbers are : "+ iRet);
    }
}