import java.io.*;
import java.util.*;

public class Program_04
 {
    public static void main(String A[])
    {
        int iRet = 0;
        int i = 0;

        Scanner sobj = null;
        String dirName = null;

        File fobj = null;
        File fArr[] =null;

        FileWriter fwobj = null; 
        FileReader frobj = null;
        
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

                for(i = 0; i < fArr.length; i++) 
                {
                    if (fArr[i].isFile()) 
                    {
                        fwobj.write("File Name: " + fArr[i].getName() + "\n");

                        frobj = new FileReader(fArr[i]);
                    
                        while ((iRet = frobj.read()) != -1) 
                        {
                            fwobj.write(iRet);
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
        catch(Exception eobj)
        {

        }
    }
}
