// Input : Hello    Output : _ello

import java.util.Scanner;

class StringX
{
    public String toLowerCaseX(String str) 
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);                                                                   
            }
        }

        return new String(Arr);        
    }
}

class program16
{
    public static void main(String A[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        sRet = strobj.toLowerCaseX(sobj);          

        System.out.println("Updated String is : "+sRet);
    }
}