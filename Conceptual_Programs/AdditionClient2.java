import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is running...");

       
        Socket sobj = new Socket("Localhost",2100);
         System.out.println("Server Succesfully conected");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

    }
}