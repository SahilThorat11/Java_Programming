import java.io.File;
import java.util.Scanner;

class Program_03 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if (dir.mkdir()) 
        {
            System.out.println("Directory created successfully.");
        } 
        else 
        {
            System.out.println("Directory already exists or cannot be created.");
        }
    }
}
