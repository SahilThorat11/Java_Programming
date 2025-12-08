import java.util.Scanner;

class Aritematic
{
    void NonFact(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

class program4_3
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Aritematic aobj = new Aritematic();

        aobj.NonFact(iValue);
    }
}