class ArrayDemo
{
    public void Reverse(int Arr[], int istart, int iend)
    {
        int temp = 0;

        while(istart < iend)
        {
            temp = Arr[istart];
            Arr[istart] = Arr[iend];
            Arr[iend] = temp;

            istart++;
            iend--;
        }
    }

    public void Rotate(int Arr[], int k)
    {
        int No = Arr.length;

        if(No == 0)
        {
            return;
        }

        k = k % No;

        // Reverse full array
        Reverse(Arr, 0, No - 1);

        // Reverse first k elements
        Reverse(Arr, 0, k - 1);

        // Reverse remaining elements
        Reverse(Arr, k, No - 1);
    }

    public void Display(int Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

class Program03
{
    public static void main(String A[])
    {
        ArrayDemo aobj = new ArrayDemo();

        int Arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array:");
        aobj.Display(Arr);

        int k = 3;

        aobj.Rotate(Arr, k);

        System.out.println("Array after rotation:");
        aobj.Display(Arr);
    }
}

/*
-----------------------------------------------------------------

Problem :   Rotate an array by k positions

Output  : 
            Original array:
            1 2 3 4 5 6 7 
            Array after rotation:
            5 6 7 1 2 3 4 

-----------------------------------------------------------------

*/ 