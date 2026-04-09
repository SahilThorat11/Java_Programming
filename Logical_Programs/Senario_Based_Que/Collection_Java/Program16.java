import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.*;

class Program16
{
    public static void main(String A[]) throws Exception
    {
        String FileName = "Marvellous.csv";

        FileWriter fwobj = new FileWriter(FileName);

        fwobj.write("name, marks\n");
    }
}