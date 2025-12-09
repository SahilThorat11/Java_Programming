import java.util.Scanner;

class Arithematic
{
    void Number(int iNo)
    {
        if(iNo < 50)
        {
            System.out.println("Small");
        }
        else if(iNo >= 50 && iNo < 100)
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Larger");
        }
    }
}

class Program8_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithematic aobj = new Arithematic();

        aobj.Number(iValue);
    }
}