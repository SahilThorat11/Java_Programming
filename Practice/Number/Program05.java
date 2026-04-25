import java.util.Scanner;

class Program05 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number till you want to print : ");
        int iNo = sobj.nextInt();

        int a = 0, b = 1;

        if(iNo >= 1)
        {
            System.out.print(a + " ");
        }

        if(iNo >= 2)
        {
            System.out.print(b + " ");
        }

        for(int i = 2; i < iNo; i++)
        {
            int c = a + b;

            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sobj.close();
    }
}
