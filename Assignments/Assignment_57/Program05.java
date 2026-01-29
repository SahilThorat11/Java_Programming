import java.io.File;
import java.util.Scanner;

class Program_05 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()) 
        {
            File[] files = dir.listFiles();

            System.out.println("\nFile Name\t\tSize (bytes)");
            System.out.println("---------------------------------");

            for (File file : files) 
            {
                if (file.isFile()) 
                {
                    System.out.println(file.getName() + "\t\t" + file.length());
                }
            }
        } 
        else 
        {
            System.out.println("Invalid directory.");
        }
    }
}
