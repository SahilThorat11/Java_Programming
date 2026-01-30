import java.io.*;
import java.util.*;

class Program_02
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory is present.");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the Directorys are : " + fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    System.out.println("File Name : " + fArr[i].getName() + "\tFile Size : " + fArr[i].length() + "bytes");
                }
            }
        }
        else
        {
            System.out.println("There is no such Directory.");
        }
        
        sobj.close();
    }
}