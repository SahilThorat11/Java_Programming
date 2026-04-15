// Swap two numbers without a temp variable
import java.util.Scanner;

class Swap
{
    // Using XOR
    public static void swap(int iNo1, int iNo2) 
    {
        System.out.println("Before: iNo1 = " + iNo1 + ", iNo2 = " + iNo2);

        iNo1 = iNo1 ^ iNo2;         // a = a + b;
        iNo2 = iNo1 ^ iNo2;         // b = a - b;
        iNo1 = iNo1 ^ iNo2;         // a = a - b;

        System.out.println("After:  iNo1 = " + iNo1 + ", iNo2 = " + iNo2);
    }
}

public class Program03
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int iValue1 = sobj.nextInt();

        System.out.print("Enter second value: ");
        int iValue2 = sobj.nextInt();

        Swap.swap(iValue1, iValue2);

        sobj.close();
    }
}