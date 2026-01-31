import java.io.*;
import java.util.*;

class Program_02 
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = null;
        
        String Filename = null;
        String line = null;

        FileReader frobj = null;
        BufferedReader brobj = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter the name of file : ");
        Filename = sobj.nextLine();

        File fobj = new File(Filename);

        if (fobj.exists()) 
        {
            frobj = new FileReader(fobj);
            brobj = new BufferedReader(frobj);

            System.out.println("File Contents:");
            while ((line = brobj.readLine()) != null) 
            {
                System.out.println(line);
            }
            brobj.close();
        } 
        else 
        {
            System.out.println("File does not exist.");
        }
    }
}
