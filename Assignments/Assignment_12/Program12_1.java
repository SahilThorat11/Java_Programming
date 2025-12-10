import java.util.Scanner;

class Arithmetic
{
    void printFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

class Program12_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        aobj.printFactors(iValue);
    }
}