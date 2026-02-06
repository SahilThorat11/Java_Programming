import java.util.Scanner;

class Program_03
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0x00000001, iMask9 = 0, iMask12 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask9 = iMask << (9 - 1);   
        iMask12 = iMask << (12 - 1); 

        if ((iNo & iMask9) != 0)
        {
            System.out.println("9th bit is ON");
        }
        else
        {
            System.out.println("9th bit is OFF");
        }

        if ((iNo & iMask12) != 0)
        {
            System.out.println("12th bit is ON");
        }
        else
        {
            System.out.println("12th bit is OFF");
        }
    }
}
