import java.util.Scanner;

class Arithmetic
{
    void displayDigit(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            System.out.println(iDigit + "\t");
        }
    }
}

class Program14_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        aobj.displayDigit(iValue);
    }
}