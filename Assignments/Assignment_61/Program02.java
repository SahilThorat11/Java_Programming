import java.io.*;
import java.util.*;

class Program02
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String Source = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String Dest = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(Source);
        FileOutputStream foobj = new FileOutputStream(Dest);

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        while((iRet = fiobj.read(Buffer)) != -1)
        {
            foobj.write(Buffer,0,iRet);
        }

        System.out.println("File copied successfully.");

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}