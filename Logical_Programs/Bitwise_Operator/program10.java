import java.util.Scanner;

class program624
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 4;
        int iResult = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("3rd bit is On");
        }
        else
        {
            System.out.println("3rd bit is Off");
        }
    }
}
