import java.io.File;
import java.util.Scanner;

class Program_04 
{
    public static void main(String A[]) 
    {
        Scanner sobj = null;
        String FileName = null;
        File file = null;

        sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name: ");
            FileName = sobj.nextLine();

            file = new File(FileName);

            if (file.createNewFile()) 
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
