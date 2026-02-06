import java.util.Scanner;

class Program_01
{
    public static void main(String A[])
    {
        int iNo = 0, iCount = 0, iMask = 0x00000001;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            if((iNo & iMask) == 1)
            {
                iCount++;
            }

            iNo = iNo >> iMask;
        }

        System.out.println("Number of 1's from given number are : " + iCount);
    }
}
