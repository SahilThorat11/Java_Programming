import java.util.Scanner;  

class Arithmetic
{
    void Table(int iNo)
    {
        int iCnt = 0, iMul = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMul = iNo * iCnt;
            System.out.print(iMul + "\t");
        }
    }
}

class Program8_4
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        aobj.Table(iValue);
    }
}