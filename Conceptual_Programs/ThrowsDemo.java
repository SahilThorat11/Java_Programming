class Demo 
{
    public int Division(int iNo1 , int iNo2) throws ArithmeticException
    {
        int iAns = 0;
        iAns = iNo1 / iNo2;
        return iAns;
    }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
        Demo obj = new Demo();
        int iRet = 0;

        try
        {
            iRet = obj.Division(11,2);
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inside catch"+aobj);
        }
        
        System.out.println("Division is : "+iRet);
    }
}