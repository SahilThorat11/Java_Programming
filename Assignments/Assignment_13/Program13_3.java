import java.util.Scanner;

class Arithmetic
{
    void printOddNumbers(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

class Program13_3
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        aobj.printOddNumbers(iValue);
    }
}