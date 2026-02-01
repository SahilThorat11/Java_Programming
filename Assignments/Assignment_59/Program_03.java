import java.io.*;
import java.util.*;

class Program_01
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = null;
        String DirName = null;
        File fobj = null;
        File fArr[] = null;

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
                    System.out.println("File Name : " + fArr[i].getName());
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