import java.io.*;
import java.util.*;

class Program_04
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

        System.out.print("Enter the file extension : ");
        String Extension = sobj.nextLine();

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
                    if(fArr[i].getName().endsWith(Extension))
                    {
                        System.out.println(fArr[i].getName());
                    }
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