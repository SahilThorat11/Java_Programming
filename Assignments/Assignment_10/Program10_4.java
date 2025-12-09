import java.util.Scanner;

class Arithmetic
{
    double FhtoCs(float fTemp)
    {
        double Celsius = 0.0;

        Celsius = (fTemp - 32) * (5.0 / 9.0);

        return Celsius;
    }
}

class Program10_4
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit : ");
        fValue = sobj.nextFloat();

        Arithmetic aobj = new Arithmetic();

        dRet = aobj.FhtoCs(fValue);

        System.out.println("Temperature in celsius is  : " + dRet);

    }
}