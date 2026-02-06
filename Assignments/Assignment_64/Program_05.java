import java.util.Scanner;

class Program_05
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask = 0x80000001L;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("First and Last bit is ON");
        }
        else
        {
            System.out.println("First and Last bit is OFF");
        }
    }
}