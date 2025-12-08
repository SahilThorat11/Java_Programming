import java.util.Scanner;

class Aritematic
{
    void FactRev(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo / 2; iCnt >= 1; iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + "\t");
            }
        }
    }
}

class program4_2
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Aritematic aobj = new Aritematic();

        aobj.FactRev(iValue);
    }
}