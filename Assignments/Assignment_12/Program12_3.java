import java.util.Scanner;

class Arithmetic
{
    int sumOfFactors(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class Program12_3
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.sumOfFactors(iValue);

        System.out.println("Summation of factors of "+iValue+ " are : " + iRet);
    }
}