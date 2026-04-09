import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.*;

class Program15
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();
        LocalTime lobj1 = LocalTime.now();
        LocalDateTime lobj2 = LocalDateTime.now();

        System.out.println(lobj);
        System.out.println(lobj1);
        System.out.println(lobj2);
    }
}