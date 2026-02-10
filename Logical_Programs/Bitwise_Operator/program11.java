import java.util.Scanner;

class program625
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        iMask = 4;

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
