import java.io.*;
import java.util.*;

class Program_03
{
    public static void main(String A[]) throws Exception
    {
        File SmallestFile = null;
        long MinSize = Long.MAX_VALUE;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present.");

            File fArr[] = fobj.listFiles();

            if(fArr == null || fArr.length == 0)
            {
                System.out.println("Directory is empty or inaccessible.");
                sobj.close();
                return;
            }

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    if(fArr[i].length() < MinSize)
                    {
                        MinSize = fArr[i].length();
                        SmallestFile = fArr[i];
                    }
                }
            }

            if(SmallestFile != null)
            {
                System.out.println("Smallest File Name : " + SmallestFile.getName() + "\tFile Size : " + MinSize + " bytes");
                System.out.println();
            }
            else
            {
                System.out.println("No files found in the directory.");
            }
        }
        else
        {
            System.out.println("There is no such Directory.");
        }

        sobj.close();
    }
}