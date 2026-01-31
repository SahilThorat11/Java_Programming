import java.io.*;
import java.util.*;

class Program_05 
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

            System.out.println("\nFile Name\tSize (bytes)");
            System.out.println("---------------------------------");

            for(i = 0; i < fArr.length; i++)
            {
                if (fArr[i].isFile()) 
                {
                    System.out.println(fArr[i].getName() + "\t\t" + fArr[i].length());
                }
            }
        } 
        else 
        {
            System.out.println("Invalid directory.");
        }
    }
}
