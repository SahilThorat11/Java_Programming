import java.util.Scanner;

class Arithmetic
{
    int CountFactors(int iNo)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Program12_2
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.CountFactors(iValue);

        System.out.println("Number of factors of "+iValue+ " are : " + iRet);
    }
}