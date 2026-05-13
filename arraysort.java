import java.util.Arrays;

public class arraysort
{   
    public static void printarr(Integer[] arr)
    {
        for(Integer i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static  int[] bubblesort(int arr[])
    {
        for(int turns=0;turns<arr.length-1;turns++)
        {
            for(int i=0;i<arr.length-1-turns;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
           int minpos=i;
           for(int j=i+1;j<arr.length;j++)
           {
            if(arr[minpos]>arr[j])
            {
                minpos=j;
            }
           }
           int temp=arr[i];
           arr[i]=arr[minpos];
           arr[minpos]=temp;
        }
        return arr;
    }
    public static void insertionsort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
    }
    public static void inbuiltsort(Integer[] arr)
    {
        Arrays.sort(arr);
    }
    public static void main(String args[])
    {
         Integer s[]={3,55,73,2,56,7,2,11};
         printarr(s);
         System.out.println();
        // selectionsort(s);
        //bubblesort(s);
        //insertionsort(s);
        inbuiltsort(s);

        printarr(s);
    }
}