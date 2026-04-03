import java.io.*;

public class Program01 
{
    public static void main(String[] args) 
    {
        try 
        {
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter source file path: ");
            String src = bobj.readLine();

            System.out.print("Enter destination file path: ");
            String dest = bobj.readLine();

            // Open streams
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

            byte buffer[] = new byte[1024]; // 1 KB buffer
            int bytesRead = 0;

            while ((bytesRead = bis.read(buffer)) != -1) 
            {
                bos.write(buffer, 0, bytesRead);
            }

            bis.close();
            bos.close();

            System.out.println("File copied successfully using buffered streams.");

        } 
        catch (IOException eobj) 
        {
            eobj.printStackTrace();
        }
    }
}