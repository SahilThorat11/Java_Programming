import java.util.Scanner;

class Arithematic
{
    boolean ChkGreater(int iNo)
    {
        if(iNo > 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program6_2
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        bRet = aobj.ChkGreater(iValue);

        if(bRet == true)
        {
            System.out.println("Greater");
        }
        else
        {
            System.out.println("Smaller");
        }
    }
}