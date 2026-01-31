import java.io.*;
import java.util.*;

class Program_02 
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = null;
        
        String Filename = null;
        String line = null;

        File fobj = null;

        FileReader frobj = null;
        BufferedReader brobj = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter the name of file : ");
        Filename = sobj.nextLine();

        fobj = new File(Filename);

        try
        {
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
                throw new FileNotFoundException("File does not exist: " + Filename);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            sobj.close();
        }
    }
}
