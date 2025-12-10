import java.util.Scanner;

class Arithmetic
{
    void RangeDisplayRev(int iStart, int iEnd)
    {
        int iCnt = 0, iSum = 0;

        if(iEnd < iStart)
        {
            System.out.println("Invalid range");
        }

        for(iCnt = iEnd; iCnt >= iStart; iCnt--)
        {
            System.out.print(iCnt + "\t");
        }
    }
}

class Program11_5
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter starting number : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Ending number : ");
        iValue2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        aobj.RangeDisplayRev(iValue1, iValue2);
    }
}