import java.util.Scanner;

class Arithematic
{
    void CheckEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            System.out.println(iNo + " is Even Number");
        }
        else
        {
            System.out.println(iNo + " is odd Number");
        }
    }
}

class program5_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Entre the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.CheckEvenOdd(iValue);
    }
}