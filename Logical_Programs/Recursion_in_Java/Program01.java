
class Demo
{
    public int Factorial(int No)
    {
        if(No == 0)
        {
            return 1;
        }
        else
        {
            return No * Factorial(No - 1);
        }
    }
}

class Program01

{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        int iRet = 0;

        iRet = dobj.Factorial(5);

        System.out.println("Factorial is : " + iRet);
    }
}