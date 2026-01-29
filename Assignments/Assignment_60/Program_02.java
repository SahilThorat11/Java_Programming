import java.io.*;
import java.util.*;

class Program_02
{
    public static void main(String A[]) throws Exception
    {
        File LargestFile = null;
        long MaxSize = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if ((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present.");

            File fArr[] = fobj.listFiles();

            if (fArr == null || fArr.length == 0)
            {
                System.out.println("Directory is empty or inaccessible.");
                sobj.close();
                return;
            }

            for (int i = 0; i < fArr.length; i++)
            {
                if (fArr[i].isFile())
                {
                    if (fArr[i].length() > MaxSize)
                    {
                        MaxSize = fArr[i].length();
                        LargestFile = fArr[i];
                    }
                }
            }

            if (LargestFile != null)
            {
                System.out.println("Largest File Name : " + LargestFile.getName() + "\tFile Size : " + MaxSize + " bytes");
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
