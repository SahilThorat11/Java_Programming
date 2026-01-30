import java.io.*;

public class Program05
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("Combined.bin");
            FileOutputStream fos = new FileOutputStream("Output1KB.bin");

            byte[] buffer = new byte[1024]; // 1 KB

            int bytesRead = fis.read(buffer);

            if (bytesRead > 0) 
            {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("First 1 KB written to Output1KB.bin");

        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}