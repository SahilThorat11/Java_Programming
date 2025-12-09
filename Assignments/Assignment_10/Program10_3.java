import java.util.Scanner;

class Arithmetic
{
    int KMtoMeter(int iKilometer)
    {
        int iMeter = 0;

        iMeter = iKilometer * 1000;

        return iMeter;
    }
}

class Program10_3
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the distance in kilometer  : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iRet = aobj.KMtoMeter(iValue);

        System.out.println("Distance in meter is : " + iRet);
    }
}