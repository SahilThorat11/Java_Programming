import java.io.*;
import java.util.*;

class Program02
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String FileName = sobj.nextLine();

        System.out.print("Enter number of bytes : ");
        int N = sobj.nextInt();

        FileInputStream fiobj = new FileInputStream(FileName);
        FileOutputStream foobj = new FileOutputStream("Output.txt");

        int data = 0;
        int Count = 0;

        while((data = fiobj.read()) != -1 && Count < N)
        {
            foobj.write(data);
            Count++;
        }

        System.out.println("First " + N + " bytes copied successfully.");

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}