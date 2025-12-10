import java.util.Scanner;

class Arithmetic
{
    int RangeSum(int iStart, int iEnd)
    {
        int iCnt = 0, iSum = 0;

        if(iStart < 0 || iEnd < iStart)
        {
            System.out.println("Invalid range");
            return 0;
        }

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        return iSum;
    }
}

class Program11_3
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter starting number : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Ending number : ");
        iValue2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.RangeSum(iValue1, iValue2);

        System.out.print("Addition of all numbers is : " + iRet);
    }
}