import java.util.*;
public class patterns
 {

    public static void starprint()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        for(int j=1;j<=n;j++)
        {
            for (int i=1;i<=n-j;i++)
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }
     
    }
    public static void invstar(int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=0;j<=c;j++)
            {
                if(i+j>=r+1)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void numberpattern()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows :");
        int r =sc.nextInt();
        System.out.print("Enter no. of columns :");
        int c =sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(j);
            }
            c--;
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        numberpattern();
    }
 }
