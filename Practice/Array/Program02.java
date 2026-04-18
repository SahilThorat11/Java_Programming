class ArrayDemo
{
    public int SecondLargest(int Arr[])
    {
        int ifirst = Integer.MIN_VALUE;
        int isecond = Integer.MIN_VALUE;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > ifirst)
            {
                isecond = ifirst;
                ifirst = Arr[i];
            }
            else if(Arr[i] > isecond && Arr[i] != ifirst)
            {
                isecond = Arr[i];
            }
        }

        if(isecond == Integer.MIN_VALUE)
        {
            System.out.println("Second largest element not found");
            return -1;
        }

        return isecond;
    }
}

class Program02
{
    public static void main(String A[])
    {
        ArrayDemo aobj = new ArrayDemo();

        int Arr[] = {11, 7, 25, 3, 99, 45};

        int iRet = aobj.SecondLargest(Arr);

        if(iRet != -1)
        {
            System.out.println("Second largest element is : " + iRet);
        }
    }
}

/*
-----------------------------------------------------------------

Problem :   Find the isecond largest element in an array

Output  : 
            Second largest element is : 45

-----------------------------------------------------------------

*/