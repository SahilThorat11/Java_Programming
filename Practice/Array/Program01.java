class ArrayDemo
{
    public void MinMax(int Arr[])
    {
        int min = Arr[0];
        int max = Arr[0];

        for(int i = 0; i < Arr.length; i++)  // for (int x : arr)
        {
            if(Arr[i] < min)
            {
                min = Arr[i];
            }

            if(Arr[i] > max)
            {
                max = Arr[i];
            }
        }

        System.out.println("Minimum element is : " + min);
        System.out.println("Maximum element is : " + max);
    }
}

class Program01
{
    public static void main(String A[])
    {
        ArrayDemo aobj = new ArrayDemo();

        int Arr[] = {11, 7, 25, 3, 99, 45};

        aobj.MinMax(Arr);
    }
}

/*
-----------------------------------------------------------------

Problem :   Find the largest and smallest element in an array

Output  : 
            Minimum element is : 3
            Maximum element is : 99

-----------------------------------------------------------------

*/