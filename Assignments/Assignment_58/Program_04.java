import java.io.*;
import java.util.Scanner;

public class Program_04
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
                    fwobj.write("File Name: " + file.getName() + "\n");

                    FileReader frobj = new FileReader(file);
                    int ch;
                    while ((ch = frobj.read()) != -1) 
                    {
                        fwobj.write(ch);
                    }
                    fwobj.write("\n\n");
                    frobj.close();
                }
            }
            System.out.println("File name and data written successfully.");
        } 
        else 
        {
            System.out.println("Invalid directory.");
        }

        fwobj.close();
    }
}
