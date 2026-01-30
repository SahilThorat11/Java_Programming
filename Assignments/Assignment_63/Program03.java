import java.io.*;

public class Program03 
{
    public static void main(String[] args) 
    {
        try 
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter source directory path: ");
            String srcDir = reader.readLine();

            System.out.print("Enter destination directory path: ");
            String destDir = reader.readLine();

            File source = new File(srcDir);
            File dest = new File(destDir);

            if (!dest.exists())
            {
                dest.mkdirs();
            }

            File[] files = source.listFiles();

            if (files != null) 
            {
                for (File f : files) 
                {
                    if (f.isFile()) 
                    {
                        FileInputStream fiobj = new FileInputStream(f);
                        FileOutputStream foobj = new FileOutputStream(new File(dest, f.getName()));

                        byte buffer[] = new byte[4096];
                        int bytesRead = 0;

                        while ((bytesRead = fiobj.read(buffer)) != -1) 
                        {
                            foobj.write(buffer, 0, bytesRead);
                        }

                        fiobj.close();
                        foobj.close();
                    }
                }
            }

            System.out.println("All files copied successfully.");

        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}