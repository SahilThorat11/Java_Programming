import java.io.*;
import java.util.*;

class Program_05
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the path : ");
        String Path = sobj.nextLine();

        File fobj = new File(Path);

        if(fobj.exists())
        {
            System.out.println("Path exists.");

            if(fobj.isFile())
            {
                System.out.println("It is a File.");
            }
            else if(fobj.isDirectory())
            {
                System.out.println("It is a Directory.");
            }
        }
        else
        {
            System.out.println("Path does not exist.");
        }

        sobj.close();
    }
}