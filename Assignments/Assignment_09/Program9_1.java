import java.util.Scanner;

class Arithmetic
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++) 
        {
            System.out.print("*\t");
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++) 
        {
            System.out.print("#\t");
        }
    }
}

class Program9_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        aobj.Display(iValue);
    }
}