import java.util.*;
class Arrayss
{
    public static void main(String args[])
    {
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i*i;
        }
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
    }
}   