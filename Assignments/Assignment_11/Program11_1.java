import java.util.Scanner;

class Arithmetic
{
    void RangeDisplay(int iStart, int iEnd)
    {
        int iCnt = 0;

        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
    }
}

class Program11_1
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

        aobj.RangeDisplay(iValue1, iValue2);
    }
}