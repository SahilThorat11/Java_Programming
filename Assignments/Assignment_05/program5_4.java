import java.util.Scanner;

class Arithematic
{
    void CheckNumber(int iNo)
    {
        if(iNo == 0)
        {
            System.out.println("Number is zero..!");
        }
        else if(iNo < 0)
        {
            System.out.println("Number is Negative..!");
        }
        else
        {
            System.out.println("Number is Positive..!");
        }
    }
}

class program5_4
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.CheckNumber(iValue);
    }
}