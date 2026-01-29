import java.io.*;
import java.util.*;

class Program_04
{
    public static void main(String A[])
    {
        int iCountFolder = 0;
        int iCountFiles = 0;
        Scanner sobj = null;
        String DirName = null;
        File fobj = null;
        File fArr[] = null;

        try
        {
            sobj = new Scanner(System.in);

            System.out.print("Enter the name of Directory : ");
            DirName = sobj.nextLine();

            fobj = new File(DirName);

            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present.");

                fArr = fobj.listFiles();

                System.out.println("Number of files in the Directorys are : " + fArr.length);

                for(int i = 0; i < fArr.length; i++)
                {
                    if(fArr[i].isDirectory())
                    {
                        iCountFolder++;
                    }
                    else 
                    {
                        iCountFiles++;
                    }
                }

                System.out.println("Number of folders in the Directorys are : " + iCountFolder);
                System.out.println("Number of files in the Directorys are : " + iCountFiles);
            }
            else
            {
                System.out.println("There is no such Directory.");
            }
            
            sobj.close();
        }
        catch(Exception eobj)
        {}
    }
}