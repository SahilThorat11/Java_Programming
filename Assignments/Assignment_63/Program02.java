import java.io.*;

public class Program02 
{
    public static void main(String[] args) 
    {
        try 
        {
            BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter source file path: ");
            String src = bobj.readLine();

            System.out.print("Enter destination file path for normal stream: ");
            String dest1 = bobj.readLine();

            System.out.print("Enter destination file path for buffered stream: ");
            String dest2 = bobj.readLine();

            long start1 = System.currentTimeMillis();
            FileInputStream fiobj = new FileInputStream(src);
            FileOutputStream foobj = new FileOutputStream(dest1);

            int b = 0;

            while ((b = fiobj.read()) != -1) 
            {
                foobj.write(b);
            }

            fiobj.close();
            foobj.close();

            long end1 = System.currentTimeMillis();

            System.out.println("Time taken by normal streams: " + (end1 - start1) + " ms");

            long start2 = System.currentTimeMillis();

            BufferedInputStream biobj = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream boobj = new BufferedOutputStream(new FileOutputStream(dest2));
            
            byte buffer[] = new byte[4096];

            int bytesRead = 0;

            while ((bytesRead = biobj.read(buffer)) != -1) 
            {
                boobj.write(buffer, 0, bytesRead);
            }

            biobj.close();
            boobj.close();

            long end2 = System.currentTimeMillis();
            System.out.println("Time taken by buffered streams: " + (end2 - start2) + " ms");

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}