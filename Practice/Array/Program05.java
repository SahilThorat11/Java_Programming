class ArrayDemo
{
    public int MissingNumber(int Arr[], int No)
    {
        int expected = No * (No + 1) / 2;
        int actual = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            actual = actual + Arr[i];
        }

        return expected - actual;
    }
}

class Program05
{
    public static void main(String A[])
    {
        ArrayDemo obj = new ArrayDemo();

        int Arr[] = {1, 2, 4, 5, 6};
        int No = 6;

        int iRet = obj.MissingNumber(Arr, No);

        System.out.println("Missing number is : " + iRet);
    }
}

/*
--------------------------------------------------------------------------------------------------------------------
Problem :
    Given an array of N-1 integers in range [1, N] with no duplicates, find the missing number.

Output : 
        Missing number is : 3

Complexity :
        Time :  O(n)
        Space : O(1)
--------------------------------------------------------------------------------------------------------------------
*/