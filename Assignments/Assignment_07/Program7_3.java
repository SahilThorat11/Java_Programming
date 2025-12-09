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

         // O(2N)
        for(iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
    }
}

class Program7_3
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