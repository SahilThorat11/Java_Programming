import java.util.Scanner;

class Arithmetic
{
    int DollarToINR(int iNo)
    {
        int iINR = 0, iDollar = 0;

        iDollar = 70;

        iINR = iNo * iDollar;

        return iINR;
    }
}

class Program9_2
{
    public static void main(String a[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.DollarToINR(iValue);

        System.out.println(iValue + "$ are " + iRet + " Indian rupees");
    }
}