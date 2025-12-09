import java.util.Scanner;

class Arithematic
{
    void MultipleDisplay(int iNo)
    {
        int iCnt = 0, temp = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            temp = iNo * iCnt;
            System.out.print(temp + "\t");    // 4   8   12  16  20
        }
    }
}

class Program7_5
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.MultipleDisplay(iValue);
    }
}