import java.io.*;
import java.util.*;

public class Program_01 
{
    public static void main(String A[]) 
    {
        int i = 0;
        Scanner sobj = null;
        String dirName = null;
        File fobj = null;
        File fArr[] = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        dirName = sobj.nextLine();

        fobj = new File(dirName);

        if (fobj.exists() && fobj.isDirectory()) 
        {
            fArr = fobj.listFiles();

            System.out.println("Regular files are :");
            for (i = 0; i < fArr.length; i++) 
            {
                if (fArr[i].isFile()) 
                {
                    System.out.println(fArr[i].getName());
                }
            }
        }
        else 
        {
            System.out.println("Invalid directory.");
        }
    }
}
