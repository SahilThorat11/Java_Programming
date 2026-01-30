import java.io.*;
import java.util.*;

class Program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");
            String FileName = sobj.nextLine();

            FileInputStream fiobj = new FileInputStream(FileName);

            int data = 0;

            while((data = fiobj.read()) != -1)
            {
                System.out.print((char)data);
            }

            fiobj.close();
        }
        catch(FileNotFoundException obj)
        {
            System.out.println("File not found.");
        }
        catch(IOException obj)
        {
            System.out.println("Error while reading file.");
        }
        catch(Exception obj)
        {
            System.out.println("Unexpected error occurred.");
        }
        finally
        {
            sobj.close();
        }
    }
}