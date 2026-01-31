import java.io.*;
import java.util.*;

class Program_03 
{
    public static void main(String A[])
    {
        Scanner sobj = null;
        String FileName = null;
        String data = null;
        FileWriter fwobj = null;

        sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name: ");
            FileName = sobj.nextLine();

            fwobj = new FileWriter(FileName, true); 

            System.out.print("Enter data to write: ");
            data = sobj.nextLine();

            fwobj.write(" " + data);

            System.out.println("Data written successfully.");

            fwobj.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}