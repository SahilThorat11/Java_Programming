import java.io.*;
import java.util.Scanner;

public class Program_03
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
                if (file.isFile()) 
                {
                    FileReader frobj = new FileReader(file);
                    int ch;
                    while ((ch = frobj.read()) != -1) 
                    {
                        fwobj.write(ch);
                    }
                    fwobj.write("\n");
                    frobj.close();
                }
            }
            System.out.println("All file data written to Marvellous.txt");
        } 
        else 
        {
            System.out.println("Invalid directory.");
        }

        fwobj.close();
    }
}
