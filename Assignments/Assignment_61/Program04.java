import java.io.*;
import java.util.*;

class Program04
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first file name : ");
        String File1 = sobj.nextLine();

        System.out.print("Enter second file name : ");
        String File2 = sobj.nextLine();

        System.out.print("Enter output file name : ");
        String OutFile = sobj.nextLine();

        FileInputStream fiobj1 = new FileInputStream(File1);
        FileInputStream fiobj2 = new FileInputStream(File2);
        FileOutputStream foobj = new FileOutputStream(OutFile);

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        while((iRet = fiobj1.read(Buffer)) != -1)
        {
            foobj.write(Buffer,0,iRet);
        }

        while((iRet = fiobj2.read(Buffer)) != -1)
        {
            foobj.write(Buffer,0,iRet);
        }

        System.out.println("Files merged successfully.");

        fiobj1.close();
        fiobj2.close();
        foobj.close();
        sobj.close();
    }
}