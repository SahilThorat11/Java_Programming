import java.util.Scanner;

class Arithmetic
{
    double SquareMeter(int SquareFeet)
    {
        double SquareMeter = 0.0;

        SquareMeter = SquareFeet * 0.0929;

        return SquareMeter;
    }
}

class Program10_5
{
    public static void main(String A[])
    {
        int iValue = 0;
        double dRet = 0.0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter area in SquareFeet : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        dRet = aobj.SquareMeter(iValue);

        System.out.println("Area in SquareMeter is  : " + dRet);

    }
}