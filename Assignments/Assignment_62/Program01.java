import java.io.*;
import java.util.*;

class Program01
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String FileName = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(FileName);

        int iRet = 0;
        int Count = 0;

        while((iRet = fiobj.read()) != -1)
        {
            Count++;
        }

        System.out.println("Total number of bytes : " + Count);

        fiobj.close();
        sobj.close();
    }
}