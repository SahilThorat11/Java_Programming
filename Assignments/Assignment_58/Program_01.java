import java.io.File;
import java.util.Scanner;

public class Program_01 
{
    public static void main(String A[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()) 
        {
            File[] files = dir.listFiles();

            System.out.println("Regular files:");
            for (File file : files) 
            {
                if (file.isFile()) 
                {
                    System.out.println(file.getName());
                }
            }
        }
        else 
        {
            System.out.println("Invalid directory.");
        }
    }
}
