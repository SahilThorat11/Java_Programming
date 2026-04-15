// Fibonacci series — iterative and recursive


import java.util.Scanner;

class Fibonacci
{
    public static void fibIterative(int iNo)
    {
        int a = 0, b = 1;

        System.out.print("Iterative: ");

        for (int i = 0; i < iNo; i++)
        {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static int fibRecursive(int iNo) 
    {
        if (iNo <= 1) 
        {
            return iNo;
        }

        return fibRecursive(iNo - 1) + fibRecursive(iNo - 2);
    }
}

public class Program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int iValue = sobj.nextInt();

        // Iterative call
        Fibonacci.fibIterative(iValue);

        // Recursive call
        System.out.print("Recursive: ");
        for (int i = 0; i < iValue; i++)
        {
            System.out.print(Fibonacci.fibRecursive(i) + " ");
        }

        sobj.close();
    }
}