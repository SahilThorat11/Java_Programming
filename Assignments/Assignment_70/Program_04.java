import java.util.Scanner;

class Program_04 
{
    static int factorial(int iNo)
    {
        if (iNo == 0 || iNo == 1)
        {
            return 1;
        }
        else
        {
            return iNo * factorial(iNo - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();

        iRet = factorial(iValue);

        System.out.println("Factorial of " + iValue + " is : " + iRet);

        sobj.close();
    }
}

