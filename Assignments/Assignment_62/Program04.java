import java.io.*;
import java.util.*;

class Program04
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String FileName = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(FileName);

        String BackupName = FileName + "_backup";

        FileOutputStream foobj = new FileOutputStream(BackupName);

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        while((iRet = fiobj.read(Buffer)) != -1)
        {
            foobj.write(Buffer,0,iRet);
        }

        System.out.println("Backup created successfully.");

        fiobj.close();
        foobj.close();
        sobj.close();
    }
}