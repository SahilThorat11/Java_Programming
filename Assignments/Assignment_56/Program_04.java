import java.io.File;
import java.util.Scanner;

class Program_04 
{
    public static void main(String A[]) 
    {
        Scanner sobj = null;
        String FileName = null;
        File fobj = null;

        sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter fobj name: ");
            FileName = sobj.nextLine();

            fobj = new File(FileName);

            if (fobj.createNewFile()) 
            {
                System.out.println("File created successfully.");
            } 
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
