import java.util.Scanner;

class Program09
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sobj.nextInt();

        System.out.print("Enter second number: ");
        int b = sobj.nextInt();

        System.out.println("Number Before Swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Number After Swap: a = " + a + ", b = " + b);

        sobj.close();
    }
}