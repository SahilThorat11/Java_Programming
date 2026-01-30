import java.io.*;

public class Program04
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter directory path: ");
            String dirPath = bobj.readLine();

            File dir = new File(dirPath);
            File[] files = dir.listFiles();

            if (files == null)
            {
                return;
            }

            FileOutputStream foobj = new FileOutputStream("Combined.bin");

            for (File f : files)
            {
                if (f.isFile())
                {
                    FileInputStream fiobj = new FileInputStream(f);
                    byte buffer[] = new byte[4096];

                    int bytesRead;

                    while ((bytesRead = fiobj.read(buffer)) != -1)
                    {
                        foobj.write(buffer, 0, bytesRead);
                    }

                    fiobj.close();
                }
            }

            foobj.close();
            System.out.println("Combined.bin created successfully.");

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}