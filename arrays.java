import java.util.*;
public class arrays
{
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static int arraysearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Found the number "+ key + " at "+i+" index");
                return i;
            }
        }
        System.out.println("Not Found");
        return-1;
    }

    public static int binarysearch(int arr[],int key)
    {
        int start=0,end =arr.length-1;
        int mid;
        for(int i=0;i<arr.length;i++)
        {
            mid=(start+end)/2;
            if(arr[mid]==key)
            {
                System.out.println("Found " + key +" at " +mid+" index");
                return mid;
            }
            else if (arr[mid]<key)
            {
                //right
                start=mid;
            }
            else{
                //left
                end=mid;
            }
        }
        System.out.println("Not found");
        return -1;
    }
    public static void pairs(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("(" + arr[i] +"," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    public static int[] sum(int arr[])
    {
        int sum[]= new int[arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum[i]=sum[i-1] + arr[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,7,8,9,12,45,67,86,444};
     //   System.out.print("Enter the no. you want to search :");
       // int key = sc.nextInt();
       // arraysearch(arr,key);
        //binarysearch(arr,key);
       // pairs(arr);
       System.out.println("Given array");
       printarr(arr);
       System.out.println("\nsum array");
       printarr(sum(arr));
       
    }
}