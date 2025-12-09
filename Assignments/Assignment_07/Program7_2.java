import java.util.Scanner;

class Printing
{
    void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        // O(N)
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
    }
}

class Program7_2
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Printing pobj = new Printing();

        pobj.Display(iValue);
    }
}