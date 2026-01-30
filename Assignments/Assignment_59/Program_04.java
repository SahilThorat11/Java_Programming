import java.io.*;
import java.util.*;

class Program_03
{
    public static void main(String A[]) throws Exception
    {
        int iCountFolder = 0, iCountFiles = 0;;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present.");

            File fArr[] = fobj.listFiles();

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
}