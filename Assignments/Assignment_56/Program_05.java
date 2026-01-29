import java.io.File;
import java.util.Scanner;

class Program_05 
{
    public static void main(String A[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()) 
        {
            String[] files = dir.list();

            System.out.println("\nFiles in directory:");
            for (String file : files) 
            {
                System.out.println(file);
            }
        } 
        else 
        {
            System.out.println("Invalid directory.");
        }
    }
}
