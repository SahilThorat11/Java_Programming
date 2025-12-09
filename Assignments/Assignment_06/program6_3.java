import java.util.Scanner;

class Arithematic
{
    boolean ChkEqual(int iNo1, int iNo2)
    {
        if(iNo1 == iNo2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program6_3
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        bRet = aobj.ChkEqual(iValue1, iValue2);

        if(bRet == true)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}