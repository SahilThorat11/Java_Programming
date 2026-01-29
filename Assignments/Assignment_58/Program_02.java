import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Program_02
 {
    public static void main(String A[]) throws Exception
     {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = sobj.nextLine();

        File dir = new File(dirName);
        FileWriter fwobj = new FileWriter("Marvellous.txt");

        if (dir.exists() && dir.isDirectory())
        {
            File[] files = dir.listFiles();

            for (File file : files)
            {
                fwobj.write(file.getName() + "\n");
            }
            System.out.println("File names written to Marvellous.txt");
        } 
        else 
        {
            System.out.println("Invalid directory.");
        }

        fwobj.close();
    }
}
