import java.util.Scanner;

class Arithmetic
{
    double CircleArea(float fRadius)
    {
        float PI = 0.0f;
        double Area = 0.0;

        PI = 3.14f;
        Area = PI * fRadius * fRadius;

        return Area;
    }
}

class Program10_1
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        fValue = sobj.nextFloat();

        Arithmetic aobj = new Arithmetic();

        dRet = aobj.CircleArea(fValue);

        System.out.println("Area of circle is : " + dRet);

    }
}