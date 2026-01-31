import java.io.*;
import java.util.*;

public class Program_02
{
    public static void main(String A[])
    {
        int i = 0;
        Scanner sobj = null;
        String dirName = null;
        File fobj = null;
        File fArr[] = null;
        FileWriter fwobj = null;

        try
        {
            sobj = new Scanner(System.in);

            System.out.print("Enter directory name: ");
            dirName = sobj.nextLine();

            fobj = new File(dirName);

            fwobj = new FileWriter("Marvellous.txt");

            if (fobj.exists() && fobj.isDirectory()) 
            {
                fArr = fobj.listFiles();

                for (i = 0; i < fArr.length; i++) 
                {
                    fwobj.write(fArr[i].getName() + "\n");
                }
                System.out.println("File names written to Marvellous.txt");
            }
            else 
            {
                System.out.println("Invalid directory or There is no such directory.");
            }

            fwobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}
