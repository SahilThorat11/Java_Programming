import java.io.File;
import java.util.Scanner;

class Program_03 
{
    public static void main(String A[]) 
    {
        Scanner sobj = null;
        String dirName = null;
        File fobj = null;

        sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        dirName = sobj.nextLine();

        fobj = new File(dirName);

        if (fobj.mkdir()) 
        {
            System.out.println("Directory created successfully.");
        } 
        else 
        {
            System.out.println("Directory already exists or cannot be created.");
        }
    }
}
