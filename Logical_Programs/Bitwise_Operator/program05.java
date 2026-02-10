import java.util.Scanner;

class program619
{
    public static void main(String A[])
    {
        int No = 0;
        int iDigit = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the Number  : ");
        No = sobj.nextInt();

        while(No != 0)
        {
            iDigit = No % 2;
            System.out.print(iDigit);
            No = No / 2;
        }
    }
}