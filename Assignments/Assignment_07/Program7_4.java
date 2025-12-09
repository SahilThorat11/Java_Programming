import java.util.Scanner;

class Arithematic
{
    void OddDisplay(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // O(N)
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

class Program7_4
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.OddDisplay(iValue);
    }
}