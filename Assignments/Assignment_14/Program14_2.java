import java.util.Scanner;

class Arithmetic
{
    boolean chkZero(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                return true;
            }

            iNo = iNo / 10;
        }

        return false;
    }
}

class Program14_2
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        bRet = aobj.chkZero(iValue);

        if(bRet == true)
        {
            System.out.println("It contains zero");
        }
        else
        {
            System.out.println("There is no zero");
        }
    }
}